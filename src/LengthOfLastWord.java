public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char [] str = s.trim().toCharArray();
        int len = s.trim().length();

        if(s.contains(" ")){
            for(int i=len-1;i>=0;i--) {
                if (str[i] == ' ') {
                    len = len - i - 1;
                    break;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int result = lengthOfLastWord.lengthOfLastWord("aa ");
        System.out.println(result);
    }
}
