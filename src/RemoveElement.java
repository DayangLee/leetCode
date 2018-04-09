public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums==null || nums.length<1) return 0;

        int idx = 0;
        int dis = 0;

        while (idx+dis <nums.length){
            nums[idx] = nums[idx+dis];
            if(nums[idx] != val){
                idx++;
            } else {
                dis++;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
       RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(new int[]{1,3,3,5,8},3));
    }
}
