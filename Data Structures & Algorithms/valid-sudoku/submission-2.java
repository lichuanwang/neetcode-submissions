class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }

                String squareKey = (i / 3) + "," + (j / 3);
                if (rows.computeIfAbsent(i, k -> new HashSet<>()).contains(c) ||
                    cols.computeIfAbsent(j, k -> new HashSet<>()).contains(c) ||
                    squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(c)
                ) {
                    return false;
                }

                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squares.get(squareKey).add(board[i][j]);
            }
        }

        return true;
    }
}
