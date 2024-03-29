import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
            } else
                map.put(nums[i], i);
        }


        return answer;
    }
}
//4ms 40mb
