import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<HashSet<Character>> lines = new ArrayList<>();
        ArrayList<HashSet<Character>> columns = new ArrayList<>();
        ArrayList<HashSet<Character>> squares = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            lines.add(new HashSet<>());
            columns.add(new HashSet<>());
            squares.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && lines.get(i).contains(board[i][j])) return false;
                lines.get(i).add(board[i][j]);
                if (board[i][j] != '.' && columns.get(j).contains(board[i][j])) return false;
                columns.get(j).add(board[i][j]);
                if (board[i][j] != '.' && squares.get((i)/3*3 + (j)/3).contains(board[i][j])) return false;
                squares.get((i)/3*3 + (j)/3).add(board[i][j]);
            }
        }
        return true;
    }
}
//4ms 43.6%
//39.1mb 63.9%
