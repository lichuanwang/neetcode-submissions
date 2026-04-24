class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }   
        int maxProfit = 0;
        int leftPointer = 0;
        int rightPointer = 1;
        while (leftPointer < prices.length - 1) {
            int diff = prices[rightPointer] - prices[leftPointer];
            if (diff > maxProfit) {
                maxProfit = diff;
            }
            if (rightPointer < prices.length - 1) {
                rightPointer++;
            } else {
                leftPointer++;
                rightPointer = leftPointer + 1;
            }
        }
        return maxProfit;
    }
}
