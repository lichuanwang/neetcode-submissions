class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res, cur = [], []
        self.helper(0, nums, res, cur)
        return res
    
    def helper(self, index, nums, res, cur):
        if index >= len(nums):
            res.append(cur.copy())
            return
        
        cur.append(nums[index])
        self.helper(index + 1, nums, res, cur)
        cur.pop()

        self.helper(index + 1, nums, res, cur)

        
        