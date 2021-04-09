public class Leetcode33 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int left = end;
        start = 0;
        end = n - 1;
        if (target >= nums[left] && target <= nums[end]) {
            start = left;
        } else {
            end = left;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,6,7,8,0,1,2,3,4};
        System.out.println(search(nums, 0));
    }
}
