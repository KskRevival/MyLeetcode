class Solution {
    private int[][] matrix;

    public int uniquePaths(int m, int n) {
        matrix = new int[m + 1][n];

        for (int i = 1; i < m + 1; i++) {
            matrix[i][0] = 1;
            for (int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j -1];
            }
        }

        return matrix[m][n - 1];
    }

}
//0ms 100%
//35.8mb 60.71%
