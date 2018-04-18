public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while(first <= last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target){
                return  mid;
            } else if(nums[mid] > target){
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return  first;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 4));
    }
}
