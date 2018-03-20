public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0)
            return 0;

        int sign = 1;
        if (x < 0)
            sign = -1;

        long result = 0;
        long num = Math.abs((long) x);

        while (num != 0) {
            result = result * 10 + num % 10;
            num = num / 10;
        }

        if ((sign == 1 && result > Integer.MAX_VALUE) || (sign == -1 && sign * result < Integer.MIN_VALUE)) {
            return 0;
        }

        return sign * (int) result;
    }


    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println(reverseInteger.reverse(-213));
    }
}
