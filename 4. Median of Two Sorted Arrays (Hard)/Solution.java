class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
        int[] merged = new int[nums1.length + nums2.length];
        int lPointer = 0, rPointer = 0;

        for (int i = 0; i < merged.length; i++) {
            if (lPointer == nums1.length) merged[i] = nums2[rPointer++];
            else if (rPointer == nums2.length) merged[i] = nums1[lPointer++];
            else if (nums1[lPointer] < nums2[rPointer]) merged[i] = nums1[lPointer++];
            else merged[i] = nums2[rPointer++];
        }

        median = (merged.length % 2 == 1) ? merged[merged.length / 2] :
                (double)(merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2;

        return median;
    }
}
//2ms 40.3mb
