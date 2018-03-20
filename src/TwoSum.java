import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(map.containsKey(num) && map.get(num) != i){
                return new int[] {i,map.get(num)};
            }
        }

        throw new IllegalArgumentException("No solution");
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {1, 2, 3, 4, 5};
        int target = 8;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
