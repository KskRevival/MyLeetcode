class Solution {
    public int removeDuplicates(int[] nums) {
        int freeSpace = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[freeSpace]){
                freeSpace++;
                nums[freeSpace] = nums[i];
            }
        }
        return freeSpace+1;
    }
}
//1ms 44.7mb
