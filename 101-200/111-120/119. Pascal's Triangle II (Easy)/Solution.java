import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        long curr = 1;
        List<Integer> list = new ArrayList<>();

        rowIndex++;
        for (int j = 1; j < rowIndex / 2 + 1; j++) {
            list.add(j - 1, (int) curr);list.add( list.size() - j, (int) curr);
            curr = curr * (rowIndex - j) / j;
        }
        if (rowIndex % 2 == 1) list.add(rowIndex / 2, (int)curr);
        return list;

    }
}
//0ms 100%
//36.2mb 70.72%
