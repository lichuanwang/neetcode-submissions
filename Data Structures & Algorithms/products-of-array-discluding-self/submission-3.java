class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prev = new int[nums.length];
        int[] after = new int[nums.length];
        int[] result = new int[nums.length];
        // 1 2 4 6
        // 1 1 2 8
        //48 24 6 1

        prev[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prev[i] = prev[i - 1] * nums[i - 1];
        }

        after[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            after[i] = after[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prev[i] * after[i];
        }

        return result;
    }
}  
