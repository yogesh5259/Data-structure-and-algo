public class Leetcode55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (i == max) {
                max = maxReach;
            }
        }
        return max >= nums.length - 1;
    }
}
