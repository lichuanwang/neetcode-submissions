class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prevP = new int[nums.length];
        int[] afterP = new int[nums.length];
        prevP[0] = 1;
        afterP[nums.length - 1] = 1;
        int currP = 1;
        // 1 [1, 2, 3]
        // prevP[1, 1, 2];
        // afrerP[1];
        // result[];
        for (int i = 1; i < nums.length; i++) {
            prevP[i] = currP * nums[i - 1];
            currP *= nums[i - 1]; 
        }

        currP = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            afterP[i] = currP * nums[i + 1];
            currP *=  nums[i + 1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prevP[i] * afterP[i];
        }

        return result;
    }
}  
