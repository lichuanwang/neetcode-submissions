class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        if len(nums) == 1:
            return nums[0]
        maxHeap = [-n for n in nums]
        heapq.heapify(maxHeap)
        for i in range(k - 1):
            heapq.heappop(maxHeap)
        return -(heapq.heappop(maxHeap))

        