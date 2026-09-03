class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        preProduct = [None] * len(nums)
        postProduct = [None] * len(nums)
        preProduct[0] = 1
        postProduct[len(nums) - 1] = 1
        for i in range(1, len(nums)):
            preProduct[i] = nums[i - 1] * preProduct[i - 1]
            postProduct[len(nums) - (i + 1)] = nums[len(nums) - i] * postProduct[len(nums) - i]
        
        for i in range(len(nums)):
            res.append(preProduct[i] * postProduct[i])
        
        return res

