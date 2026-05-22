class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // key is the number, value is the count
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Integer>[] count = new List[nums.length + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = new ArrayList<>();
        }

        map.forEach((key, value) -> {
            count[value].add(key);
        });

        int[] result = new int[k];
        int curr = 0;
        for (int i = count.length - 1; i > 0; i--) {
            for (int num : count[i]) {
                result[curr] = num;
                if (curr == k - 1) {
                    return result;
                }
                curr++;
            }
        }

        return result;
        
    }
}
