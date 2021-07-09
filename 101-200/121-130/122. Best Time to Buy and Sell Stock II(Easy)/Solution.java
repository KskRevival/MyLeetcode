class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min = prices[0], it = 1;

        while (it < prices.length){
            while (it < prices.length && prices[it] <= min) min = prices[it++];
            while (it < prices.length && prices[it] >= prices[it - 1]) profit += prices[it] - prices[it++ - 1];
            if (it < prices.length) min = prices[it++];
        }

        return profit;
    }
}
//0ms 100%
//38.4mb 81.94%
