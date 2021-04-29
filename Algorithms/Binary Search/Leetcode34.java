public class Leetcode34 {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int ans1 = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans1 = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        int ans2 = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans2 = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] { ans1, ans2 };

    }
}
