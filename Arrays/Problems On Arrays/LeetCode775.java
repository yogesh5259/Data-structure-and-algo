public class LeetCode775{
    public static boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++)
            if (i - A[i] > 1 || i - A[i] < -1) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,0,2};
        System.out.println(isIdealPermutation(input));
    }
}