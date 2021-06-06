import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3) return list;
        Arrays.sort(nums);
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                pos = i;
                break;
            } else if (nums[i] == 0){
                pos = nums.length;
            }
        }
        for (int i = 0; i < pos; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1, target = -nums[i];
            while (low < high){
                if (nums[low] + nums[high] == target) {
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++; high--;
                } else if (nums[low] + nums[high] > target) high--; else low++;
            }
        }

        return list;
    }

}
//17ms: faster than 93.26% java submissions
//42.4mb: less than 96.92% java submissions
