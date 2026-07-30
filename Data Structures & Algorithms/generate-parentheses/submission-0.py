class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        def backtrack(openP, closeP, cur):
            if closeP > openP:
                return
            
            if len(cur) == 2 * n:
                if openP == closeP:
                    res.append("".join(cur.copy()))
                return
            
            cur.append('(')
            backtrack(openP + 1, closeP, cur)
            cur.pop()

            cur.append(')')
            backtrack(openP, closeP + 1, cur)
            cur.pop()
        
        backtrack(0, 0, [])
        return res
            
            


        

        
        