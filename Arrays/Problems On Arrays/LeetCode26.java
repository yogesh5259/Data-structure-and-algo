import java.util.Arrays;

public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                continue;
            else {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(input);
        for(int j = 0; j < i; j++){
            System.out.print(input[j] + " ");
        }
    }
}