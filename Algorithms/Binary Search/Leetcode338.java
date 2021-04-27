public class Leetcode338 {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int n = i;
            int ans = 0;
            while (n != 0) {
                ans++;
                n &= (n - 1);
            }
            result[i] = ans;
        }
        return result;
    }
}