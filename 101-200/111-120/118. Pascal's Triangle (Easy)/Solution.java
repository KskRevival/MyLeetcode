import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); ans.add(list);

        for (int i = 1; i < numRows; i++) {
            list = new ArrayList<>();
            List<Integer> prev = ans.get(i -1);
            for (int j = 0; j <= i; j++) {
                int curr = 0;
                if (j > 0) curr += prev.get(j - 1);
                if (j < i) curr += prev.get(j);
                list.add(curr);
            }
            ans.add(list);
        }

        return ans;
    }

}
//0ms 100%
//36.6mb 94.94%
