public class BTTBASSFour {
    public static int helper(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    
    public static int maxProfit(int k, int[] prices) {
        if(prices.length <= 0 || k <= 0){
            return 0;
        }
        
        if(k > prices.length / 2){
            return helper(prices);
        }
        
        int[] minp = new int[k];
        int[] maxp = new int[k];
        for(int i = 0; i < k; i++){
            minp[i] = Integer.MAX_VALUE;
            maxp[i] = 0;
        }
        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < k; j++){
                minp[j] = Math.min(minp[j], prices[i] - (j > 0 ? maxp[j - 1] : 0));
                maxp[j] = Math.max(maxp[j], prices[i] - minp[j]);
            }
        }
        return maxp[k-1];
    }
    public static void main(String[] args) {
        int[] input = new int[]{2,4,1};
        System.out.println(maxProfit(2, input));
    }
}