class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else profit = Math.max(profit, prices[i] - min); 
        }

        return profit;
    }
}
//1ms 64.95%
//52.2mb 58.87%
