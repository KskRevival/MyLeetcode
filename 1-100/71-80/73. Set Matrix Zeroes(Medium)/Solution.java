import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> lines = new HashSet<>();
        HashSet<Integer> columns = new HashSet<>();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    lines.add(i);
                    columns.add(j);
                }
            }
        }

        for(Integer it : columns){
            for (int i = 0; i < matrix.length; i++) matrix[i][it] = 0;
        }

        for(Integer it : lines){
            for (int i = 0; i < matrix[0].length; i++) matrix[it][i] = 0;
        }
    }
}
//1ms 93.51%
//40.4mb 71.39%
