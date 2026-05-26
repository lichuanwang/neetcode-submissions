class Solution {
    public int[] twoSum(int[] nums, int target) {
        // value, index
        Map<Integer, Integer> map = new HashMap<>();

        // 1 2 3 6 -> 5
        // 1, 2, 
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];

            if (map.containsKey(remain)) {
                return new int[]{map.get(remain), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
