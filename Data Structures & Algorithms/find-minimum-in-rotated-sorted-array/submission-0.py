class Solution:
    def findMin(self, nums: List[int]) -> int:
        # 2 3 4 5 1
        l, r = 0, len(nums) - 1
        if nums[l] <= nums[r]:
            return nums[l]
        
        while (r - l) > 1:
            mid = (r + l) // 2
            num = nums[mid];

            if num > nums[l]:
                l = mid
            else:
                r = mid
        
        return nums[r]



        

