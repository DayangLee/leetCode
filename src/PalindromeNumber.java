public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        int len = 1;
        while(x/len >= 10)
            len *= 10;

        while(x>0){
            int start = x/len;
            int end = x % 10;

            if(start != end)
                return false;
            else
                x = (x % len) / 10;
                len = len/100;
        }

        return true;
    }
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        System.out.println(palindromeNumber.isPalindrome(-323));
    }
}
