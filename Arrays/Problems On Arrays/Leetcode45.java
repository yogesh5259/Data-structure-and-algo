public class Leetcode45 {
    public int jump(int[] nums) {
        int cur = 0, max = 0, count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == cur) {
                count++;
                cur = max;
            }

        }
        return count;
    }
}
