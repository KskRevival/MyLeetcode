class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int l = 0, r = nums.length-1;
        
        while (l <= r){
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                ans = new int[]{mid, mid};
                break;
            }
            if (target > nums[mid]) l = mid + 1;
            else r = mid - 1;
        }

        if (ans[0] != -1){
            while (ans[0] > 0 && nums[ans[0] - 1] == target) ans[0]--;
            while (ans[1] < nums.length - 1 && nums[ans[1] + 1] == target) ans[1]++;
        }

        return ans;
    }
}
//0ms 42.3mb
