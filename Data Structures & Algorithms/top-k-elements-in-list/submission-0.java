class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Build the frequency map
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        // 2. Create a list of the unique numbers
        List<Integer> list = new ArrayList<>(countMap.keySet());

        // 3. Sort the list by frequency in descending order
        // (b, a) -> countMap.get(b) - countMap.get(a) puts higher counts first
        list.sort((a, b) -> countMap.get(b) - countMap.get(a));

        // 4. Extract the top K elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}