import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    char[][] buttons = new char[][]{{}, {}, {'a', 'b', 'c'},{'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'},
                                {'m', 'n', 'o'}, {'p', 'q', 'r', 's'},{'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    char[] nums;
    ArrayList<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return list;
        nums = digits.toCharArray();
        for (int i = 0; i < nums.length; i++) nums[i] -= '0';
        int[] mas = new int[nums.length];
        recurs(0, mas);
        return list;
    }

    public void recurs(int level, int[] pos){
        if (level == nums.length){
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < nums.length; i++) {
                s.append(buttons[nums[i]][pos[i]]);
            }
            list.add(s.toString());
        } else {
            int[] mas = Arrays.copyOf(pos, nums.length);
            for (int i = 0; i < buttons[nums[level]].length; i++) {
                recurs(level+1, mas);
                mas[level]++;
            }
        }

    }
}
//1ms 39.6mb
