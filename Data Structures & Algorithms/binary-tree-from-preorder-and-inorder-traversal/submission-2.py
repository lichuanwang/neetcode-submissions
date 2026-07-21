# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        inorder_map = {v:i for i, v in enumerate(inorder)}
        pre_index = 0 
        def dfs(l , r):
            nonlocal pre_index
            if l > r:
                return None
            root_val = preorder[pre_index]
            pre_index += 1
            root = TreeNode(root_val)
            mid = inorder_map[root_val]
            # through setting l and r, we can limit what is being put to the left and subtree
            # and then the right subtree
            # 基本上就是在判斷說，pre-order list中接下來的有幾個會被擺在 left subtree，然後有幾個被擺到 right subtree。
            root.left = dfs(l, mid - 1)
            root.right = dfs(mid + 1, r)
            return root
        
        return dfs(0, len(inorder) - 1)
        
        