class Solution {
    public int myAtoi(String s) {
        int n = s.length(), it = 0;
        boolean plus = true;
        long  answer = 0;
        while(it < n && s.charAt(it) == ' ') it++;
        if (it < n && s.charAt(it) == '+') it++;
        else if (it < n && s.charAt(it) == '-'){
            plus = false;
            it++;
        }
        while(it < n && s.charAt(it) >= '0' && s.charAt(it) <= '9'){
            answer = plus ? answer*10 + s.charAt(it) - '0' : answer*10 - s.charAt(it) + '0';
            if (answer < Integer.MIN_VALUE){
                answer = Integer.MIN_VALUE;
                break;
            }
            if (answer > Integer.MAX_VALUE){
                answer = Integer.MAX_VALUE;
                break;
            }
            it++;
        }

        return (int)answer;
    }
}
//2ms 40mb
