class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, side = height[l] > height[r] ? 0 : 1, lFix = l, rFix = r;
        int answer = (r - l) * Math.min(height[l], height[r]);

        while (l < r){
            while (side == 1 && l < r){
                l++;
                if (height[l] > height[lFix]){
                    lFix = l;
                    answer = Math.max(answer, Math.min(height[lFix], height[rFix]) * (rFix - lFix));
                    if (height[lFix] > height[rFix]) side = 0;
                }
            }
            while (side == 0 && l < r){
                r--;
                if (height[r] > height[rFix]){
                    rFix = r;
                    answer = Math.max(answer, Math.min(height[lFix], height[rFix]) * (rFix - lFix));
                    if (height[rFix] > height[lFix]) side = 1;
                }
            }
        }

        return answer;
    }
}
//4ms 78.8mb
