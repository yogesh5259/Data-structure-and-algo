import java.util.Arrays;

class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < n) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{0,1,0,3,12};
        moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }
}