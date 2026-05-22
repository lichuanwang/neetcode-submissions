class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            
            String key = Arrays.toString(arr);
            List<String> update = map.getOrDefault(key, new ArrayList<>());
            update.add(str);
            map.put(key, update);
        }
        

        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}
