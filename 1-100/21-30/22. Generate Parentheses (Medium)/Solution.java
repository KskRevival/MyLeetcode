import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        fill(new StringBuilder(),n,n,n);
        return answer;
    }

    public void fill(StringBuilder curr, int l, int r, int n){
        if (l == 0 && r == 0) answer.add(curr.toString());
        if (l > 0 && l <= r) fill(new StringBuilder(curr + "("), l - 1, r, n);
        if (l != n && r > 0) fill(new StringBuilder(curr + ")"), l, r - 1, n);
    }
}
//1ms 71.83%
//38.8mb 93.1%
