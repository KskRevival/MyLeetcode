class Solution {
    public String addStrings(String num1, String num2) {
        int a = num1.length(), b = num2.length(), pos = Math.max(a,b);
        int aPtr = 0, bPtr = 0, ptr = 0;
        int[] mem = new int[pos + 1];
        StringBuilder ans = new StringBuilder();

        while(aPtr < a && bPtr < b){
            mem[ptr] += (num1.charAt(a - aPtr - 1) - '0') + (num2.charAt(b - bPtr - 1) - '0');
            if (mem[ptr] > 9) mem[ptr + 1] = 1;
            mem[ptr++] %= 10; aPtr++; bPtr++;
        }

        while (aPtr < a){
            mem[ptr] += num1.charAt(a - aPtr++ - 1) - '0';
            if (mem[ptr] > 9) mem[ptr + 1] = 1;
            mem[ptr++] %= 10;
        }
        while (bPtr < b){
            mem[ptr] += num2.charAt(b - bPtr++ - 1) - '0';
            if (mem[ptr] > 9) mem[ptr + 1] = 1;
            mem[ptr++] %= 10;
        }

        for (int i = pos; i >= 0; i--){
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
//2ms 91.62%
//38.8mb 86.23%
