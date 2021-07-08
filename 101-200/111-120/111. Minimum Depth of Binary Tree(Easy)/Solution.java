class Solution {
    private int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        goDeep(root, 1);
        return min;
    }

    private void goDeep(TreeNode root, int depth){
        if (depth > min || root == null) return;
        if (root.left == null && root.right == null) min = Math.min(depth, min);
        else {
            goDeep(root.left, depth + 1);
            goDeep(root.right, depth + 1);
        }
    }
}
//1ms 85.38% 
//59.3mb 81.29%  
