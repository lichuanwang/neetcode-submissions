class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char s1C = s1.charAt(i);
            char s2C = s2.charAt(i);
            s1Arr[s1C - 'a']++;
            s2Arr[s2C - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < s1Arr.length; i++) {
            if (s1Arr[i] == s2Arr[i]) {
                matches++;
            }
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            if (matches == 26) {
                return true;
            }
            
            char s2C = s2.charAt(r);
            int index = s2C - 'a';
            s2Arr[index]++;

            if (s2Arr[index] - 1 == s1Arr[index]) {
                matches--;
            } else if (s2Arr[index] == s1Arr[index]) {
                matches++;
            }

            index = s2.charAt(l) - 'a';
            s2Arr[index]--;
            if (s2Arr[index] == s1Arr[index]) {
                matches++;
            } else if (s2Arr[index] + 1 == s1Arr[index]) {
                matches--;
            }
            l++;
        }

        return matches == 26;


    }
}
