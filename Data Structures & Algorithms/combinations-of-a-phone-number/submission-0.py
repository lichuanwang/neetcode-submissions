class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        dToL = {
            '2': ['a', 'b', 'c'],
            '3': ['d', 'e', 'f'],
            '4': ['g', 'h', 'i'],
            '5': ['j', 'k', 'l'],
            '6': ['m', 'n', 'o'],
            '7': ['p', 'q', 'r', 's'],
            '8': ['t', 'u', 'v'],
            '9': ['w', 'x', 'y', 'z']
        }

        combinationLength = len(digits)
        res = []
        combination = []
        def backtrack(remain_digits):
            # if the combination have the length that equals to the length of digits
            # then add it the the result
            if len(combination) == combinationLength:
                res.append("".join(combination.copy()))
                return

            # for each digit in digits, we need to check all its possible letter
            for c in dToL[remain_digits[0]]:
                combination.append(c)
                backtrack(remain_digits[1:])
                combination.pop()
        
        backtrack(digits)
        return res

        
        