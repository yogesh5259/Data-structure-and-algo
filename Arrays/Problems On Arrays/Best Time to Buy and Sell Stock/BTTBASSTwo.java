public class BTTBASSTwo {
    public static void main(String[] args) {
        int[] inputArray = {7,1,5,3,6,4};
        System.out.println(maxProfit(inputArray)); 
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > prices[i - 1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
