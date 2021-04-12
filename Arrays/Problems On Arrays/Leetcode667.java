import java.util.Arrays;

public class Leetcode667 {
    public static int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int left = 1, i = 0, right = n;
        while (i < k) {
            if (i % 2 == 0) {
                ans[i] = right--;
            } else {
                ans[i] = left++;
            }
            i++;
        }
        if (i % 2 == 0) {
            while (left <= right) {
                ans[i] = left++;
                i++;
            }
        } else {
            while (left <= right) {
                ans[i] = right--;
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructArray(9, 2)));
    }
}