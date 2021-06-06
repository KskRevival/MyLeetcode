import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int dif = Math.abs(target - nums[0] - nums[1] - nums[2]);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high){
                int sum = nums[low] + nums[high] + nums[i];
                if (Math.abs(target - sum) < dif) {
                    dif = Math.abs(target - sum);
                    res = sum;
                }
                if (sum < target){
                    low++;
                } else {
                    high--;
                }
            }
        }
        return res;
    }
}
//6ms: faster than 46% of java solutions
//38.9mb: less than 25.26% of java solutions 
