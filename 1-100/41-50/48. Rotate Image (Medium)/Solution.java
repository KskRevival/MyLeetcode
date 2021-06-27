class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        for (int i = 0; i < (n+1) / 2; i++) {
            for (int j = i; j <n - 1 - i; j++) {
                circle(matrix,i, j, n);
            }
        }
    }

    private void circle(int[][] matrix, int a, int b, int n){
        int val = matrix[a][b];
        for (int i = 0; i < 4; i++) {
            int tmp = b, prevVal = val;
            b = n - a -1; a = tmp;
            val = matrix[a][b];
            matrix[a][b] = prevVal;
        }
    }
}
//0ms 100%
//39mb 69.63%
