class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int longest = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            if (r - l + 1 > longest) {
                longest = r - l + 1;
            }

            set.add(s.charAt(r));
        }

        return longest;
    }    
}
