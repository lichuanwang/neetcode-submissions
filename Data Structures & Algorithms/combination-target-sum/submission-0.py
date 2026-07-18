class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res, cur = [], []
        self.helper(0, nums, res, cur, target)
        return res
    
    def helper(self, index, nums, res, cur, target):
        if sum(cur) == target:
            res.append(cur.copy())
            return
        
        if index >= len(nums) or sum(cur) > target:
            return
        
        cur.append(nums[index])
        self.helper(index, nums, res, cur, target)
        cur.pop()

        self.helper(index + 1, nums, res, cur, target)
