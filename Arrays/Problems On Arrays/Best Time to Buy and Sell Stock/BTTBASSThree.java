public class BTTBASSThree {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min_price1 = Integer.MAX_VALUE;
        int profit1 = 0;
        int min_price2 = Integer.MAX_VALUE;
        int profit2 = 0;
        for(int i = 0; i < n; i++){
            min_price1 = Math.min(min_price1, prices[i]);
            System.out.print(min_price1+" ");
            profit1 = Math.max(profit1, prices[i] - min_price1);
            System.out.print(profit1 + " ");
            min_price2 = Math.min(min_price2, prices[i] - profit1);
            System.out.print(min_price2 + " ");
            profit2 = Math.max(profit2, prices[i] - min_price2);
            System.out.print(profit2 + " ");
            System.out.println();
        }
        return profit2;
    }
    public static void main(String[] args) {
        int[] input = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(input));
    }
}