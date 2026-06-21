# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        res = True
        def dfs(p, q):
            nonlocal res
            if not p and not q:
                return True
            elif p and q and p.val == q.val:
                dfs(p.left, q.left)
                dfs(p.right, q.right)
                return True
            else:
                res = False
                return False
        
        dfs(p,q)
        return res
            
            





            
            
        