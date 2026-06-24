class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        
        diameter = 0
        def dfs(root):
            nonlocal diameter
            if not root:
                return -1
            
            left = dfs(root.left) + 1
            right = dfs(root.right) + 1
            diameter = max((left + right), diameter)
            return max(left, right)
        
        dfs(root)
        return diameter