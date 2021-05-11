public class Leetcode1423 {
    public int maxScore(int[] c, int k) {
        int ans = 0;
        int j = k - 1, z = c.length - 1;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += c[i];
        }
        ans = sum;
        for(int i = 0; i < k; i++){
            ans -= c[j];
            ans += c[z];
            sum = Math.max(sum,ans);
            j--;
            z--;
        }
        return sum;
    }
}