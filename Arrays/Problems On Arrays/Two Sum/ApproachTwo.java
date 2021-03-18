import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ApproachTwo {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int y = target - nums[i]; 
            if(map.containsKey(y)){
                return new int[]{i,map.get(y)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] inputArray = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(inputArray, 9)));
    }
}
