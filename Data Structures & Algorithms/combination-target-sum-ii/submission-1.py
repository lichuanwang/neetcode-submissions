class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        
        res = []
        candidates.sort()
        def helper(i, cur, total):
            if total == target:
                res.append(cur.copy())
                return
            
            if total > target or i == len(candidates):
                return

            # if we have input of 1,1,1,2,3 with target 3
            # we have the 1's like
            # append three times
            # [1]
            # [1, 1]
            # [1, 1, 1] this we check all the combinations we have with three 1's
            # res.append()
            # and then pop()
            # we get [1, 1], so we go on and check all the combinations we have with two 1's
            # go into while loop and check other elements that are not 1's
            # keep going...
            # include the element
            cur.append(candidates[i])
            helper(i + 1, cur, total + candidates[i])
            cur.pop()

            # exclude the element
            while i + 1 < len(candidates) and candidates[i + 1] == candidates[i]:
                i += 1 
            helper(i + 1, cur, total)

        helper(0, [], 0)
        return res 
#                          []
#          /          |         \          \
#     Pick 3 ones  Pick 2 ones  Pick 1 one  Pick 0 ones
#      [1,1,1]      [1,1]        [1]          []
#         |           |           |            |
#    (Move to 2) (Move to 2) (Move to 2)  (Move to 2)