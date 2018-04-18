public class CountAndSay {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";

        String str = countAndSay(n-1) + "#";
        char [] x = str.toCharArray();
        int count = 1;
        String res = "";
        for(int i=0; i< x.length-1 ;i++){
            if(x[i] == x[i+1]){
                count ++;
            } else {
                res = res + count + x[i];
                count = 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        String result = countAndSay.countAndSay(5);
        System.out.println(result);
    }
}
