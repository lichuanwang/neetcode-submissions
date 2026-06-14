class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        outerL, outerR = 0, len(matrix) - 1
        while outerL <= outerR:
            outerMid = (outerL + outerR) // 2
            arrayLength = len(matrix[outerMid])
            l, r = 0, arrayLength - 1
            while l <= r:
                mid = (l + r) // 2
                value = matrix[outerMid][mid]
                if value == target:
                    return True
                elif value > target:
                    r = mid - 1
                else:
                    l = mid + 1

            if target > matrix[outerMid][arrayLength - 1]:
                outerL = outerMid + 1
            elif target < matrix[outerMid][0]:
                outerR = outerMid - 1
            else:
                return False
        
        return False
