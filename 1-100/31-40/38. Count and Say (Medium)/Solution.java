class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            s = saying(s);
        }
        return s;
    }

    public String saying(String s) {
        StringBuilder builder = new StringBuilder();
        char curr = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                builder.append(count).append(curr);
                curr = s.charAt(i); count = 1;
            }
            else count++;
        }
        builder.append(count).append(curr);
        return builder.toString();
    }
}
//1ms 99.8%
//36.5mb 77.66% 
