class Solution {
    private boolean answer = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left, 0) - maxDepth(root.right, 0)) < 2 && answer;
    }

    private int maxDepth(TreeNode root, int depth){
        if (root == null) return depth;
        int left = maxDepth(root.left,depth + 1), right = maxDepth(root.right,depth + 1);
        answer = answer && Math.abs(left - right) < 2;
        return Math.max(left, right);
    }
}
//0ms 100%
//39.2mb 35.61%
