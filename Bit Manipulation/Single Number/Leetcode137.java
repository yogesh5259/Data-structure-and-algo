import java.util.Arrays;

public class Leetcode137{
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        if(nums == null) return 0;
        if(nums.length == 1) return nums[0];
        if( nums.length > 1 && nums[0] != nums[1]) return nums[0];
        if( nums.length > 1 && nums[nums.length - 2] != nums[nums.length - 1]) return nums[nums.length - 1];

System.out.println(Arrays.toString(nums));
        for(int i = 1; i < nums.length; i += 3){
            if(nums[i] != nums[i - 1]){
                ans = nums[i-1];
                break;
            }
        }
        
        return ans;
    }
}