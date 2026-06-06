class Solution:
    def search(self, nums: List[int], target: int) -> int:
        # 3 4 0 1 2
        # 1 2
        # 3 4 5 6 1 2 *1
        # 3 4 1 2 
        # 3 5 1
        # 1 0
        l, r = 0, len(nums) - 1

        while l <= r:
            mid = (l + r) // 2
            
            if nums[mid] == target:
                return mid
            
            # left sorted portion
            if nums[l] <= nums[mid]:
                if target > nums[mid] or target < nums[l]:
                    l = mid + 1
                else:
                    r = mid - 1
            # right sorted portion
            else:
                if target < nums[mid] or target > nums[r]:
                    r = mid - 1
                else:
                    l = mid + 1
        
        return -1

        
        