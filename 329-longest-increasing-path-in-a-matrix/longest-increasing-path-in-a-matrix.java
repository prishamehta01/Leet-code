class Solution {
    int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}}; // right, down, left, up
    int rows, cols;

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;

        rows = matrix.length;
        cols = matrix[0].length;

        int[][] memo = new int[rows][cols];
        int maxLen = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, i, j, memo));
            }
        }
        return maxLen;
    }

    private int dfs(int[][] matrix, int i, int j, int[][] memo) {
        if(memo[i][j] != 0) return memo[i][j];

        int max = 1;
        for(int[] dir : dirs) {
            int x = i + dir[0];
            int y = j + dir[1];

            if(x >= 0 && y >= 0 && x < rows && y < cols && matrix[x][y] > matrix[i][j]) {
                int len = 1 + dfs(matrix, x, y, memo);
                max = Math.max(max, len);
            }
        }

        memo[i][j] = max;
        return max;
    }
}
