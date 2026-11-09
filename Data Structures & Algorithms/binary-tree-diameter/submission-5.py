# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        diameter = 0
        if root == None:
            return 0
        def maxDepth(root):
            nonlocal diameter
            if root == None:
                return 0
            leftMax = maxDepth(root.left)
            rightMax = maxDepth(root.right) 
            if leftMax + rightMax > diameter:
                diameter = leftMax + rightMax
            return max(leftMax, rightMax) + 1
        
        maxDepth(root)
        return diameter
        

        