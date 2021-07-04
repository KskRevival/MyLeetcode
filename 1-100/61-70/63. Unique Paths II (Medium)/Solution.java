class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1 ||
            obstacleGrid[0][0] == 1) return 0;

        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1){ //rock
                    if (i < obstacleGrid.length - 1 && obstacleGrid[i + 1][j] != 1) obstacleGrid[i + 1][j] -= 1;
                    if (j < obstacleGrid[0].length - 1 && obstacleGrid[i][j + 1] != 1) obstacleGrid[i][j + 1] -= 1;
                }
                else if (i == 0 && j == 0) obstacleGrid[0][0] = 1;
                else if (i == 0) obstacleGrid[i][j] += obstacleGrid[i][j - 1];
                else if (j == 0)obstacleGrid[i][j] += obstacleGrid[i - 1][j];
                else obstacleGrid[i][j] += obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
            }
        }

        return Math.max(obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1], 0);
    }
}
//0ms 100%
//38.3mb 51.17%
