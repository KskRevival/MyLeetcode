import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder answer = new StringBuilder(); int i = 0;
        String a = strs[0], b = strs[strs.length - 1];
        while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) answer.append(a.charAt(i++));
        return answer.toString();
    }
}
//1ms 37mb
