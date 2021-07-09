class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] ends = new int[nums.length];

        int size = 0;

        for(int num : nums){
            int l = 0, r = size;

            while (l != r){
                int mid = (l + r) / 2;
                if (ends[mid] < num) l = mid + 1;
                else r = mid;
            }

            ends[l] = num;

            if (l == size) size++;

        }

        return size;
    }
}
//2ms 98.57%
//38.5mb 68.15%
