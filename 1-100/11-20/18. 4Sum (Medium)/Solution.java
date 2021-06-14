import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return list;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            threeSum(nums, target - nums[i], i);
        }
        return list;
    }

    public void threeSum(int[] nums, int goal, int addition) {
        for (int i = addition + 1; i < nums.length - 2; i++) {
            if (i > addition + 1 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1;
            int target = goal - nums[i];
            while (low < high){
                if (nums[low] + nums[high] == target) {
                    list.add(Arrays.asList(nums[i], nums[low], nums[high],nums[addition]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++; high--;
                } else if (nums[low] + nums[high] > target) high--; else low++;
            }
        }
    }
}
//13ms 78.52%
//39.4mb 71.28%
