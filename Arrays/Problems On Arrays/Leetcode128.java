public class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int temp = nums[i];
                int c = 0;
                while (set.contains(temp)) {
                    c++;
                    temp = temp + 1;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}
