class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        nonValIndex = []
        valCount = 0
        for i in range(len(nums)):
            if nums[i] != val:
                valCount += 1
                nonValIndex.append(i)
        
        for i in range(valCount):
            tmp = nums[i]
            nums[i] = nums[nonValIndex[i]]
            nums[nonValIndex[i]] = tmp
        
        return valCount