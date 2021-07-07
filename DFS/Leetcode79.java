class Solution {
    boolean visited[][];

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (word.charAt(0) == board[i][j] && dfs(i, j, 0, word, board)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int r, int c, int i, String word, char[][] board) {

        if (word.length() == i) {
            return true;
        }
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || visited[r][c]
                || word.charAt(i) != board[r][c])
            return false;

        visited[r][c] = true;

        if (dfs(r + 1, c, i + 1, word, board) || dfs(r, c + 1, i + 1, word, board) || dfs(r - 1, c, i + 1, word, board)
                || dfs(r, c - 1, i + 1, word, board)) {
            return true;
        }
        visited[r][c] = false;
        return false;
    }
}