import java.util.ArrayList;

class Solution {
    public String getPermutation(int n, int k) {
        int[] factorials = {1,2,6,24,120,720,5040,40320};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        StringBuilder builder = new StringBuilder();

        k--;
        for (int i = n - 2; i >= 0; i--){
            int index = k / factorials[i];
            builder.append(list.get(index));
            list.remove(index);
            k %= factorials[i];
        }
        builder.append(list.get(0));

        return builder.toString();
    }

}
//1ms 97.31%
//36.2mb 80.45%
