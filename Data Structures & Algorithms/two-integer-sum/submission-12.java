class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain) && map.get(remain) != i) {
                if (i <= map.get(remain)) {
                    result[0] = i;
                    result[1] = map.get(remain);
                } else {
                    result[0] = map.get(remain);
                    result[1] = i;
                }
            }
        }

        return result;
    }
}
