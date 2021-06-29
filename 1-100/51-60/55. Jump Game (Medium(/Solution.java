class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length - 1;
        int farthest = len;

        for (int i = len; i >= 0; --i) {
            if (i + nums[i] >= farthest) {
                farthest = i;
            }
        }

        return farthest == 0;
    }
}
//1ms 93.73%
//39mb 99.87% 
