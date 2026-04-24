class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        int result = 1;
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int next = num;
                int count = 1;
                while (set.contains(++next)) {
                    count++;
                }

                if (count > result) {
                    result = count;
                }
            }
        }

        return result;
    }
}

// space complexity = O(n)
// time complexity = O(n)
