import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> ans = new ArrayList<>();
    int up, down,right, left;
    boolean work = true;

    public List<Integer> spiralOrder(int[][] matrix) {
        up = 0; down = matrix.length - 1; right = matrix[0].length - 1; left = 0;
        int pos = 0;

        while (work){
            switch (pos % 4) {
                case 0 -> goRight(matrix);
                case 1 -> goDown(matrix);
                case 2 -> goLeft(matrix);
                case 3 -> goUp(matrix);
            }
            pos++;
        }

        return ans;
    }

    private void goRight(int[][] matrix){
        for (int i = left; i <= right; i++) ans.add(matrix[up][i]);
        up++;
        work = up <= down;
    }
    private void goLeft(int[][] matrix){
        for (int i = right; i >= left; i--) ans.add(matrix[down][i]);
        down--;
        work = down >= up;
    }
    private void goUp(int[][] matrix){
        for (int i = down; i >= up; i--) ans.add(matrix[i][left]);
        left++;
        work = left <= right;
    }
    private void goDown(int[][] matrix){
        for (int i = up; i <= down; i++) ans.add(matrix[i][right]);
        right--;
        work = right >= left;
    }
}
//0ms 100%
//37.3mb 42.46%
