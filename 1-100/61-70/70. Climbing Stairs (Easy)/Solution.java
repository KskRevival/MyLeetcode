class Solution {
    public int climbStairs(int n) {
        int m2 = 1, m1 = 1, num = 1;
        for (int i = 1; i < n; i++) {
            num = m2 + m1;
            m2 = m1; m1 = num;
        }  
        return num;
    }
}
//0ms 35.7mb
