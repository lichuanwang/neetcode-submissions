class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # -1 0 2 1 -2
        # -2, -1, 0 , 1, 1, 2
        # -1,0,1,2,-1,-4
        # -4, -1, -1, 0, 1, 2
        nums.sort()
        result = []
        for i in range(len(nums)):
            if i != 0 and nums[i] == nums[i - 1]:
                continue
            remain = 0 - nums[i];
            l, r = i + 1, len(nums) - 1
            while l < r:
                twoSum = nums[l] + nums[r];
                if twoSum == remain:
                   result.append([nums[i], nums[l], nums[r]])
                   r -= 1
                   l += 1
                   while l < r and nums[l] == nums[l - 1]:
                       l += 1
                elif twoSum > remain:
                    r -= 1
                else:
                    l += 1


        return result 
        
        




        


        