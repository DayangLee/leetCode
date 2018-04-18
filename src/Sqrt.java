public class Sqrt {
    public int mySqrt(int x) {
        int left=1,right = x;

        while (left <= right){
            int mid = left + (right - left) /2;
            if(mid <= x/mid){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left-1;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(2147395599);
        System.out.println(result);
    }
}
