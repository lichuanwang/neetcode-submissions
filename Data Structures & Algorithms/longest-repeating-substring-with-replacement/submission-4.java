class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0;
        int[] count = new int[26];
        int l = 0;
        int r = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            count[c - 'A']++;
            int currentMaxCount = 0;
            for (int num : count) {
                currentMaxCount = Math.max(currentMaxCount, num);
            }

            int winLength = r - l + 1;
            if (winLength - currentMaxCount > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            } else {
                longest = Math.max(longest, winLength);
            }

            r++;
        }

        return longest;
    }
}
