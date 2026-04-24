class Solution {

    public String encode(List<String> strs) {
            String result = "";
            for (String s : strs) {
                result += s.length() + "#" + s;
            }
            System.out.println(result);
            return result;
    }

    public List<String> decode(String str) {
        // 5#hello5#world
        int index = 0;
        int currLength = 0;
        String currSLength = "";
        List<String> result = new ArrayList<>();

        while (index < str.length()) {
            String word = "";
            if (str.charAt(index) != '#') {
                currSLength += str.charAt(index);
                index++;
            } else {
                currLength = Integer.parseInt(currSLength);
                index++;
                for (int i = index; i < index + currLength; i++) {
                    word += str.charAt(i);
                }
                result.add(word);
                index += currLength;
                currLength = 0;
                currSLength = "";
            }
        }
        return result;
    }
}
