public class LeetCode69 {
    public static int mySqrt(int x) {
        long start = 0;
        long end = x;
        int ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid <= x) {
                ans = (int) mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}