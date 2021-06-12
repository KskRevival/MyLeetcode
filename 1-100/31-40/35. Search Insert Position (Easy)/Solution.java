class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (l < r){
            int m = (l + r) / 2;
            if (m+1 < nums.length && nums[m + 1] <= target) l = m;
            else if (m > 0 && nums[m - 1] >= target) r = m;
            else return nums[m] > target ? m : nums[m] == target ? m : m + 1;
        }
        return -1;
    }
}
//0ms 100%
//38.4mb 84.41%
