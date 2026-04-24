public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }


        int remain = 0;
        for (int i = 0; i < nums.length; i++) {
            remain = target - nums[i];
            if (map.containsKey(remain) && map.get(remain) != i) {
                return new int[]{i, map.get(remain)};
            }
        }

        return new int[0];
    }
}