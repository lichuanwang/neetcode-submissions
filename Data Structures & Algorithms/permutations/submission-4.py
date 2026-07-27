class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []
        used = [False] * len(nums)

        def backtrack(path):
            # Base Case: All slots are filled
            if len(path) == len(nums):
                res.append(path.copy()) # Save a copy of the completed permutation
                return

            # Recursive Case: Try every available number for the current slot
            for i in range(len(nums)):
                if not used[i]:
                    # 1. Make a decision
                    used[i] = True
                    path.append(nums[i])

                    # 2. Explore deeper (fill the next slot)
                    backtrack(path)

                    # 3. Undo the decision (Backtrack)
                    path.pop()
                    used[i] = False

        backtrack([])
        return res