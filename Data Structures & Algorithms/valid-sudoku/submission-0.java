class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        
        // checking row my row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) {
                        return false;
                    } else {
                        set.add(c);
                    }
                }
                
            }
            set.clear();
        }

        // Checking column-by-column
        for (int j = 0; j < 9; j++) { // Lock onto Column j
            for (int i = 0; i < 9; i++) { // Walk down Rows i
                char current = board[i][j]; // 🌟 Fllipped: board[row][col]
                
                if (current != '.') {
                    if (set.contains(current)) {
                        return false;
                    }
                    set.add(current);
                }
            }
            set.clear(); // Clear the set before moving to the next column!
        }
        
        for (int i = 0; i < board.length; i++) {
            
            if (i % 3 == 0) {
                set.clear();
            }

            for (int j = 0; j < 3; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) {
                        return false;
                    }
                    set.add(c);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            
            if (i % 3 == 0) {
                set.clear();
            }

            for (int j = 3; j < 6; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) {
                        return false;
                    }

                    set.add(c);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            
            if (i % 3 == 0) {
                set.clear();
            }

            for (int j = 6; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (set.contains(c)) {
                        return false;
                    }
                    
                    set.add(c);
                }
            }
        }

        return true;
        
    }
}
