class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m -= 1; n-= 1;
        while (m >= 0 && n >= 0){
            nums1[m + n + 1] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        if (n >= 0){
            for (int i = 0; i < n + 1; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
}
//0ms 100%
//38.6mb 94.22%
