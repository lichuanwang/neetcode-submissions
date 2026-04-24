class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] result = new int[2];
        int remain;
        for (int i = 0; i < nums.length; i++) {
            remain = target - nums[i];
            if (map.containsKey(remain) && map.get(remain) != i) {
                result[0] = i;
                result[1] = map.get(remain);
                return result;
            }
        }

        return result;
    }
}
