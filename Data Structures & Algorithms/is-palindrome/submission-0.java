class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int rightPointer = cleanString.length() - 1;
        int leftPointer = 0;
        while (rightPointer - leftPointer > 0) {
            if (cleanString.charAt(leftPointer) != cleanString.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}

