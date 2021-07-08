class Solution {
    private int[] globalNums;
    public TreeNode sortedArrayToBST(int[] nums) {
        globalNums = nums;
        TreeNode root = assignChildren(0, nums.length - 1);
        return root;
    }

    private TreeNode assignChildren(int l, int r){
        if (l <= r){
            int mid = (l + r) / 2;
            TreeNode root = new TreeNode(globalNums[mid]);
            root.left = assignChildren(l, mid - 1);
            root.right = assignChildren(mid + 1, r);
            return root;
        }
        return null;
    }

}
//0ms 100%
//38.5mb 76.73%
