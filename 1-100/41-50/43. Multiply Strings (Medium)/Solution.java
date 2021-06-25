class Solution {
    public String multiply(String num1, String num2) {
        int a = num1.length(), b = num2.length(), pos = a + b;
        int[] mem = new int[pos + 2];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < a; i++)
            for (int j = 0; j < b; j++)
                mem[i + j] += (num1.charAt(a - i - 1) - '0') * (num2.charAt(b - j - 1) - '0');

        for (int i = 0; i < pos - 1; i++) {
            mem[i + 1] += mem[i] / 10;
            mem[i] %= 10;
        }

        for (int i = pos - 1; i >= 0; i--){
            if (mem[i] != 0) {
                pos = i;
                break;
            }
            if (i == 0){
                ans.append(0);
                pos = -1;
            }
        }

        for (int i = pos; i >= 0; i--)
            ans.append(mem[i]);

        return ans.toString();
    }
}
//2ms 99.36%
//39.2mb 33.82%
