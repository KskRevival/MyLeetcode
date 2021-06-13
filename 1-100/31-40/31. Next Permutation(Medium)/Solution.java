import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int point = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]){
                point = i - 1;
                break;
            }
        }
        if (point != -1){
            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i] > nums[point]){
                    int tmp = nums[point];
                    nums[point] = nums[i];
                    nums[i] = tmp;
                    break;
                }
            }
        }
        for (int i = 1; i < (nums.length - point)/2+1; i++) {
            int tmp = nums[i + point];
            nums[i + point] = nums[nums.length - i];
            nums[nums.length - i] = tmp;
        }
    }
}
//0ms 100%
//39mb 75.2%
