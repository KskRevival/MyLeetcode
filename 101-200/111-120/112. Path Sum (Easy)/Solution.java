class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return targetSum == 0;
        targetSum-= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
//I do not agree with leetcode 2 testcases:
//            1) when given root is null and targetSum == 0 it should be true
//            2) when root is leaf too and targetSum == root.val it should be true
