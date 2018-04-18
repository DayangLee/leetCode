public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = nums[i] + (sum >= 0 ? sum : 0);
            max = sum > max ? sum : max;
        }

        return max;
    }
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int result = maximumSubarray.maxSubArray(new int[]{-2});
        System.out.println(result);
    }
}
