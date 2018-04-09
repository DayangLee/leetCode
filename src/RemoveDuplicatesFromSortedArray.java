public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[count]) {
                count ++;
                nums[count] = nums[i];
            }
        }
        return count + 1;

    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2, 2, 4, 6}));
    }
}
