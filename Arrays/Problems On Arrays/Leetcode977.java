public class Leetcode977 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int k = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int a = Math.abs(nums[i]);
            int b = Math.abs(nums[j]);
            if (a >= b) {
                ans[k] = a * a;
                i++;
                k--;
            } else {
                ans[k] = b * b;
                k--;
                j--;
            }
        }
        return ans;
    }
}