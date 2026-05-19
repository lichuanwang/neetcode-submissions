class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        // a, a vs a
        for (String s : strs) {
            int[] arr = new int[26];
            for (char c : s.toCharArray()){
                int index = c - 'a';
                arr[index]++;
            }

            String key = Arrays.toString(arr);
            List<String> list;
            if (!map.containsKey(key)) {
                list = new ArrayList<>();
            } else {
                list = map.get(key);
            }

            list.add(s);
            map.put(key, list);
        }

        for (List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}
