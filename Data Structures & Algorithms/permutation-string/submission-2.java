class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // a // [1, 0,.....]
        // ca// [0, 0, 1, 0,.......]
        // matches = 0
        // after the second loop
        // matches = 24;
        // s2 -> a
        // s2 -> [1, 0, 1, 0,......]
        // matches++ -> 25
        // s2 -> [1, 0, 0,......]
        // matches++ -> 26
        // l -> 1
        // matches == 26 -> return true

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char s1C = s1.charAt(i);
            char s2C = s2.charAt(i);
            s1Count[s1C - 'a']++;
            s2Count[s2C - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) {
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {

            if (matches == 26) {
                return true;
            }

            char c = s2.charAt(r);
            int index = c - 'a';
            s2Count[index]++;
            
            if (s2Count[index] - 1 == s1Count[index]) {
                matches--;
            } else if (s2Count[index] == s1Count[index]) {
                matches++;
            }
            
            c = s2.charAt(l);
            index = c - 'a';
            s2Count[index]--;

            if (s2Count[index] + 1 == s1Count[index]) {
                matches--;
            } else if (s2Count[index] == s1Count[index]) {
                matches++;
            }

            l++;
        }

        return matches == 26;
    }
}