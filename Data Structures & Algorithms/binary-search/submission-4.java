class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;
        // 1 2 3 4 6
        // l   m   r
        //     l m r
        //       l r  
        while (l <= r) {
            int mid = (l + r) / 2;
            int current = nums[mid];

            if (current == target) {
                return mid;
            }

            if (current < target) {
                l = mid + 1;
            }

            if (current > target) {
                r = mid - 1;
            }

        }

        return -1;
    }
}
