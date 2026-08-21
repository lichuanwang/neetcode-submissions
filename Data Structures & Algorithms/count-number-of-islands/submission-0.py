class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        # creating a visited matrix the same as the input to know the place that we have already visited
        # explore all four direction
        # if out of bound return 
        # if visited continue to the next one in that direction
        rows, cols = len(grid), len(grid[0])
        res = 0
        def dfs(row, col):
            nonlocal res
            if (row < 0 or col < 0 or row == rows or 
                col == cols or grid[row][col] == '0'):
                return
            
            grid[row][col] = '0'
            dfs(row + 1, col)
            dfs(row - 1, col)
            dfs(row, col + 1)
            dfs(row, col - 1)
        
        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == '1':
                    dfs(r, c)
                    res += 1
        return res

        
            
        
            

                

            




        

        