public class StockGuide {

    /**
     *
     * Say you have an array for which the ith element is the price of a given stock on day i.
     *
     * If you were only permitted to complete at most one transaction
     * (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     *
     * Note that you cannot sell a stock before you buy one.
     *
     * Example 1:
     *
     * Input: [7,1,5,3,6,4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     *              Not 7-1 = 6, as selling price needs to be larger than buying price.
     * Example 2:
     *
     * Input: [7,6,4,3,1]
     * Output: 0
     * Explanation: In this case, no transaction is done, i.e. max profit = 0.
     * @param args
     */
    public static void main(String[] args) {
       System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
       System.out.println(maxProfit(new int[]{1,8,5,3,6,4}));
       System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }

    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min = prices[0];
        for(int i = 0; i  < prices.length-1; i++) {

            // if 1st day is lesser than next day then invest
            if (prices[i] < prices[i+1]) {

                // keep track of minimum so that we can use that to gauge maximum profit
               if (prices[i] < min) {
                   min =prices[i];
               }

               int currentProfit =  prices[i + 1] - min;
               maxprofit = currentProfit > maxprofit ? currentProfit : maxprofit;
           }
        }
        return maxprofit;
    }
}
