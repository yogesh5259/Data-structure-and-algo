import java.util.HashSet;
import java.util.Set;

class ApprochOne {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() == nums.length) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(input));
    }
}