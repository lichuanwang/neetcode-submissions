class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 123
        // 456
        // 789
        
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[i].length - 1;
            while (l <= r) {
                int midIndex = (l + r) / 2;
                int mid = matrix[i][midIndex];
                if (mid < target) {
                    l = midIndex + 1;
                }  else if (mid > target) {
                    r = midIndex - 1;
                } else {
                    return true;
                }
            }
        }

        return false;

    }
}
