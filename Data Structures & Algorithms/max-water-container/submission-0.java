class Solution {
    public int maxArea(int[] heights) {
        // 1,2
        // 1,3,2
        // 1,3,2,3
        int res = 0;
        int l = 0;
        int r = heights.length - 1;
        int area;

        while (l < r) {
            area = Math.min(heights[l], heights[r]) * (r - l);
            res = Math.max(area, res);
            if (heights[r] < heights[l]) {
                r--;
            } else {
                l++;
            }
        }

        return res;


    }
}
