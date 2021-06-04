class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        char[] c = String.valueOf(x).toCharArray();
        int n = c.length;
        for (int i = 0; i < n / 2; i++) {
            if (c[i] != c[n - 1 - i]) return false;
        }
        return true;
    }
}
//7ms 38.3mb
