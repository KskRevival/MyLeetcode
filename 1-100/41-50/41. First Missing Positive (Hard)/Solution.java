class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length, ptr = 0;
        while (ptr < n){
            if (nums[ptr] > 0 && nums[ptr] <= n && nums[ptr] != nums[nums[ptr] - 1])
                swap(nums, ptr, nums[ptr] - 1);
            else ptr++;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) return i+1;
        }

        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//1ms 76.46%
//86.5mb 28.05%
