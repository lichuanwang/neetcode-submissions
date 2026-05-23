class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : nums) {
            int currLength = 1;
            int nextNum = num + 1;
            while (set.contains(nextNum)) {
                currLength++;
                nextNum++;
            }

            if (currLength > maxLength) {
                maxLength = currLength;
            }
        }

        return maxLength;
    }
}
