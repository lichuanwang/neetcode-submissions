class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        // [1,2,2,3,3]
        List<Integer>[] frequency = new List[nums.length + 1];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }
        //[0,0,0,0,0,0]
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            frequency[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        // k * n operation
        for (int i = frequency.length - 1; i > 0 && index < k; i--) {
            for (int n : frequency[i]) {
                result[index++] = n;
                if (index == k) {
                    return result;
                }
            }
        }
        
        return result;






    }
}