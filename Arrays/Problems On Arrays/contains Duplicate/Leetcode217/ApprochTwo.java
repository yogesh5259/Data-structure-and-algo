import java.util.HashMap;
import java.util.Map;

class ApprochTwo {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            } else{
                map.put(nums[i], 1);
            }
        }
        for(var v : map.keySet()){
            if(map.get(v) > 1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(input));
    }
    }

}