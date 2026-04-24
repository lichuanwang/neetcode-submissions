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
        // 1, 5 ,2, 3
        // 1, 1, 1, 1
        // 1, 3, 5, 7
        // 0, 3, 2, 1, 0, 3, 2, 1
        // -1, 3, 2, 1, 0
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int next = num;
                int count = 1;
                while (set.contains(++next)) {
                    System.out.println(next);
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
