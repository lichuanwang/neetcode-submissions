class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // 1 4 5 6 8 
        int result = 0;
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }

            int count = 1;
            int next = num + 1;
            while (set.contains(next)) {
                count++;
                next++;
            }

            if (count > result) {
                result = count;
            }
        }

        return result;
    }
}
