import java.util.Arrays;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, idx = m+n-1;
        while (i>=0 && j>=0){
            if(nums1[i] <= nums2[j]){
                nums1[idx] = nums2[j];
                idx--;
                j--;
            } else {
                nums1[idx] = nums1[i];
                idx --;
                i--;
            }
        }
        while (j>=0){
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }

        return nums1;
    }
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] result = mergeSortedArray.merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(result));
    }
}
