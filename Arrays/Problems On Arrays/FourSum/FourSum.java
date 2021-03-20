import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 0; i < n; i++){
            int remain1 = target - nums[i];
            for(int j = i+1; j < n; j++){
                int remain = remain1 - nums[j];
                int left = j+1;
                int right = n - 1;
                while(left < right){
                    if(nums[left] + nums[right] == remain){
                        List<Integer> newlist = Arrays.asList(nums[i],nums[j],nums[left],nums[right]);
                        result.add(newlist);
                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }else if(nums[left] + nums[right] < remain) left++;
                    else if(nums[left] + nums[right] > remain)right--;
                }
                while(j+1 < n && nums[j] == nums[j+1]) j++;
            }
            while(i+1 < n && nums[i] == nums[i+1]) i++;
        }
       return result;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,0,-1,0,-2,2};
        System.out.println(fourSum(input, 0));
    }
}
