public class Leetcode153 {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == nums[end]) {
                return nums[mid];
            }

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[end];
    }

    public static void main(String[] args) {
        int[] input = new int[]{3,4,5,1,2};
        System.out.println(findMin(input));
    }
}