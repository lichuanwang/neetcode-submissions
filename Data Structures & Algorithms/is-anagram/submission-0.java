class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> s1 = stringToMap(s);
        Map<Character, Integer> s2 = stringToMap(t);
        return s1.equals(s2);
    }

    public Map<Character, Integer> stringToMap(String s) {
        Map<Character, Integer> s1 = new HashMap<>();
        for (int i  = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (s1.containsKey(letter)) {
                s1.put(letter, s1.get(letter) + 1);
            } else {
                s1.put(letter, 1);
            }
        }

        return s1;
    }
}
