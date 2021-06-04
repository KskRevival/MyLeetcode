class Solution {
    public String longestPalindrome(String s) {
        String longest = String.valueOf(s.charAt(0));
        int n = s.length(), dif;

        for (int i = 0; i < n - 1; i++) {
            dif = 1;
            if (i > 0 && s.charAt(i - 1) == s.charAt(i + 1)){
                while (i - dif >= 0 && i + dif < n && s.charAt(i - dif) == s.charAt(i + dif)) {
                    dif++;
                }
                if (dif * 2 - 1 > longest.length()) longest = s.substring(i - dif + 1, i + dif);
            }
            dif = 1;
            if (s.charAt(i) == s.charAt(i + 1)){
                while (i - dif >= 0 && i + 1 + dif < n && s.charAt(i - dif) == s.charAt(i + 1 + dif)){
                    dif++;
                }
                if (dif * 2 > longest.length()) longest = s.substring(i - dif + 1, i + dif + 1);
            }
        }

        return longest;
    }
}
//23ms 39.5mb
