class Solution {
    public int removeDuplicates(int[] nums) {
        int changes = 0, freeSpace = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]){
                changes++;
            } else {
                nums[freeSpace] = nums[i];
                freeSpace++;
            }
        }
        return nums.length - changes;
    }
}
//2ms 44.7mb
