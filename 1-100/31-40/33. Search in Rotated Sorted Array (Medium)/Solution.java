class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length - 1);
        if (target < nums[0]) return binarySearch(nums, target, pivot + 1, nums.length - 1);
        return binarySearch(nums, target,0, pivot);
    }

    public int findPivot(int[] arr, int low, int high) {
        if (high < low) return arr.length - 1;
        if (high == low) return low;
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

    public int binarySearch(int[] arr, int target, int l, int r){
        int mid = (l+r)/2;
        if (arr[mid] == target) return mid;
        if (l >= r) return -1;
        if (target > arr[mid]) return binarySearch(arr, target, mid + 1, r);
        return binarySearch(arr, target, l, mid - 1);

    }
}
//0ms 100%
//38.1mb 86.56%
