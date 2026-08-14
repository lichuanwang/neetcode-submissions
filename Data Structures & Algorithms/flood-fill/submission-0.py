class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        # dfs
        # base case: 
        # 1. if exceed the bound of the matrix
        # 2. if the pixel color is not the same as the original color of the adjacent pixel return

        # repeated task:
        # check all direction up down left right to see whether they are the same as starting pixel
        # if yes: change color 
        # if no: return
        if not image:
            return image
        startingColor = image[sr][sc]
        if startingColor == color:
            return image
        ROW, COL = len(image), len(image[0])

        def dfs(sr, sc):
            nonlocal image
            if sr < 0 or sc < 0 or sr == ROW or sc == COL or image[sr][sc] != startingColor:
                return
            
            image[sr][sc] = color
            dfs(sr + 1, sc)
            dfs(sr - 1, sc)
            dfs(sr, sc + 1)
            dfs(sr, sc - 1)
        dfs(sr, sc)
        return image


        