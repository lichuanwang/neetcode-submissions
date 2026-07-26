class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res, cur = [], []
        self.helper(0, nums, res, cur, 0, target)
        return res
    
    def helper(self, index, nums, res, cur, total, target):
        if total == target:
            res.append(cur.copy())
            return
        
        if index >= len(nums) or total > target:
            return
        
        cur.append(nums[index])
        self.helper(index, nums, res, cur, total + nums[index], target)
        cur.pop()

        self.helper(index + 1, nums, res, cur, total, target)
