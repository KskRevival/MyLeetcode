import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<Integer> list = new ArrayList<>();
    int[] arr;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        arr = candidates;
        deep(target, 0);
        return ans;
    }

    public void deep(int n, int pos){
        if (n == 0) ans.add(new ArrayList<>(list));
        if (n < arr[pos]) return;
        for (int i = pos; i < arr.length; i++) {
            list.add(arr[i]);
            deep(n - arr[i], i);
            list.remove(list.size() - 1);
        }
    }
}
//2ms 98.4%
//39.4mb 45.54%
