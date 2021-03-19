import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreeSum{
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            int remain = -nums[i];
            int left = i+1;
            int right = n - 1;
            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum == remain){
                    List<Integer> newlist = Arrays.asList(nums[i],nums[left],nums[right]);
                    result.add(newlist);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                } else if(sum < remain){
                    left++;
                } else {
                    right--;
                }
            }
            while(i+1 < n && nums[i] == nums[i+1]) i++;
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] inputArray = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(inputArray));
    }
}