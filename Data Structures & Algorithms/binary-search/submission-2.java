class Solution {
    public int search(int[] nums, int target) {
        // 1, 2, 3, 5, 6
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2); // ensure there is no overflow, otherwise we can just write (r + l) / 2
            int currNum = nums[mid];
            if (currNum < target) {
                 l = mid + 1;
            } else if (currNum > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
