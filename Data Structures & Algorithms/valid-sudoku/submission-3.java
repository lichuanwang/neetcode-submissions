class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }
                String key = (i / 3) + "," + (j / 3);
                if (rows.computeIfAbsent(i, k -> new HashSet<>()).contains(c) ||
                    cols.computeIfAbsent(j, k -> new HashSet<>()).contains(c) ||
                    squares.computeIfAbsent(key, k -> new HashSet<>()).contains(c)
                ) {
                    return false;
                }

                rows.get(i).add(c);
                cols.get(j).add(c);
                squares.get(key).add(c);
            }
        }

        return true;


    }
}
