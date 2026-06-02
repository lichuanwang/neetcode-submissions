class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            result += str.length() + "#" + str;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            String string = "";
            int index = delimiter + 1;
            for (int j = index; j < index + length; j++) {
                string += str.charAt(j);
            }
            result.add(string);
            i = index + length;
        }

        return result;
    }
}
