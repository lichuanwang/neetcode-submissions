class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        data = {}
        halfLength = len(nums) // 2
        for num in nums:
            if num in data:
                data[num] = data[num] + 1
            else:
                data[num] = 1
            
            if data[num] > halfLength:
                return num
        

        