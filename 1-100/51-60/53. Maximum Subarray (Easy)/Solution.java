class Solution {
    public int maxSubArray(int[] nums) {
        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i -1]);
            if (nums[i] > answer) answer = nums[i];
        }
        return answer;
    }
}
//1ms 41.7mb
