class Solution {
    public int lengthOfLastWord(String s) {
        int it = s.length() - 1;
        while (it >= 0 && s.charAt(it) == ' ') it--;
        for (int i = it; i >= 0; i--) {
            if (s.charAt(i) == ' ') return it - i;
            if (i == 0) return it+1;
        }
        return 0;
    }
}
//0ms 37.4mb
