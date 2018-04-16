public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        if(l1<l2)
            return -1;
        if(l2 == 0)
            return 0;

        for(int i=0;i<l1-l2+1;i++){
            if(haystack.substring(i,i+l2).equals(needle))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        System.out.println(implementstrStr.strStr("abc99abc","99"));
    }
}
