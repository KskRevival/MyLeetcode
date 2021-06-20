import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<Integer> list = new ArrayList<>();
    int[] arr;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        arr = candidates;
        deep(target, 0);
        return ans;
    }

    public void deep(int n, int pos){
        if (n == 0) ans.add(new ArrayList<>(list));
        if (pos >= arr.length || n < arr[pos]) return;
        for (int i = pos; i < arr.length; i++) {
            if (i > pos && arr[i] == arr[i -1]) continue;
            list.add(arr[i]);
            deep(n - arr[i], i+1);
            list.remove(list.size() - 1);
        }
    }
}
//2ms 99.05%
//39.04mb 35.03%
