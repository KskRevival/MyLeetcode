class Solution {
    public int jump(int[] nums) {
        int ptr = 0, count = 1;

        if (nums.length == 1) return 0;

        while (ptr + nums[ptr] < nums.length - 1){
            count++;
            int  move = ptr+1, localMax = nums[move], pos = ptr + 1;
            while (move < ptr + nums[ptr]){
                move++;
                int k = nums[move] + move - ptr - 1;
                if (k >= localMax && nums[move] != 0){
                    localMax = k;
                    pos = move;
                }
            }
            ptr = pos;
        }

        return count;
    }
}
//0ms 100%
//40mb 14.19%
