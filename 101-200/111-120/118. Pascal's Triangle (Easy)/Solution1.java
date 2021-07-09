import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); ans.add(list);


        for (int i = 2; i < numRows + 1; i++) {
            int curr = 1;
            list = new ArrayList<>();
            for (int j = 1; j < i / 2 + 1; j++) {
                list.add(j - 1, curr);list.add( list.size() - j, curr);
                curr = curr * (i - j) / j;
            }
            if (i % 2 == 1) list.add(i / 2, curr);
            ans.add(list);
        }

        return ans;
    }

}
//1ms 12.06%
//38.3mb 7.22%
