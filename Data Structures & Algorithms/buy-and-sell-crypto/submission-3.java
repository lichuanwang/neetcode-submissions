class Solution {
    public int maxProfit(int[] prices) {
        // 10, 2, 7, 6, 5, 5
        
        int l = 0;
        int r = 1;
        int maxProfit = 0;

        while (r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
                r = l + 1;
            } else {
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
                r++;
            }
        }

        return maxProfit;
    }
}
