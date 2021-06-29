import java.util.ArrayList;
import java.util.List;

class Solution {
    int[][] matrix;
    int up, down,right, left, num = 1;

    public int[][] generateMatrix(int n) {
        matrix = new int[n][n];
        up = 0; down = n- 1; right = n - 1; left = 0;
        int pos = 0, sq = n*n + 1;

        while (num < sq){
            switch (pos % 4) {
                case 0 -> goRight(matrix);
                case 1 -> goDown(matrix);
                case 2 -> goLeft(matrix);
                case 3 -> goUp(matrix);
            }
            pos++;
        }

        return matrix;
    }

    private void goRight(int[][] matrix){
        for (int i = left; i <= right; i++) matrix[up][i] = num++;
        up++;
    }
    private void goLeft(int[][] matrix){
        for (int i = right; i >= left; i--) matrix[down][i] = num++;
        down--;
    }
    private void goUp(int[][] matrix){
        for (int i = down; i >= up; i--) matrix[i][left] = num++;
        left++;
    }
    private void goDown(int[][] matrix){
        for (int i = up; i <= down; i++) matrix[i][right] = num++;
        right--;
    }
}
//0ms 100%
//36.9mb 76.59%
