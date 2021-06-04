class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case 'M':
                    answer += 1000;
                    break;
                case 'D':
                    answer += 500;
                    break;
                case 'C':
                    answer += (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) ? -100 : 100;
                    break;
                case 'L':
                    answer += 50;
                    break;
                case 'X':
                    answer += (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) ? -10 : 10;
                    break;
                case 'V':
                    answer += 5;
                    break;
                case 'I':
                    answer += (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) ? -1 : 1;
                    break;
            }
        }
        return answer;
    }
}
//3ms 39.3mb
