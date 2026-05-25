class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s2.length() < s1.length()) {
            return false;
        }

        char[] s1Count = new char[26];
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int l = 0;
        int r = s1.length();
        while (r <= s2.length()) {
            char[] count = new char[26];
            for (int i = l; i < r; i++) {
                char c = s2.charAt(i);
                count[c - 'a']++;
            }

            if (Arrays.equals(s1Count, count)) {
                return true;
            }

            l++;
            r = l + s1.length();
        }

        return false;
        
        
    }
}
