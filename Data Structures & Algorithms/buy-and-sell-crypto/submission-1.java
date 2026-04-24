class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }   
        int maxProfit = 0;
        int leftPointer = 0;
        int rightPointer = 1;
        while (rightPointer < prices.length) {
            if (prices[leftPointer] < prices[rightPointer]) {
                int diff = prices[rightPointer] - prices[leftPointer];
                maxProfit = Math.max(maxProfit, diff);
            } else {
                leftPointer = rightPointer;
            }
            rightPointer++;
        }
        return maxProfit;
    }
}
