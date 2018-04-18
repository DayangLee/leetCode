import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int num = 1;
        for(int i=digits.length-1;i>=0;i--){
            if(num == 1){
                if(digits[i] == 9){
                    if(i == 0){
                        int[] newDigits = new int[digits.length + 1];
                        for (int j = 1; j < digits.length; j++)
                            newDigits[j + 1] = digits[j];
                        newDigits[0] = 1;
                        return newDigits;
                    } else {
                        digits[i] = 0;
                    }
                } else {
                    digits[i] = digits[i] + 1;
                    num = 0;
                }


            }
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] result = plusOne.plusOne(new int[]{9});
        System.out.println(Arrays.toString(result));
    }
}
