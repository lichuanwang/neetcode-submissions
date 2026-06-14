class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # 10 9 2 1 5
        # 1
        # 1 2
        maxProfit = 0
        l, r = 0, 1

        while r < len(prices):

            maxProfit = max(maxProfit, prices[r] - prices[l])
            if prices[l] >= prices[r]:
                l = r

            r += 1
        
        return maxProfit