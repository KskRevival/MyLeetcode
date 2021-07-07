class Solution {
    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if (root != null) goDown(root, 1);
        return maxDepth;
    }

    private void goDown(TreeNode node,int currDepth){
        if (node.left == null && node.right == null) maxDepth = Math.max(maxDepth, currDepth);
        else{
            if (node.left != null) goDown(node.left, currDepth+1);
            if (node.right != null) goDown(node.right, currDepth+1);
        }
    }
}
//0ms 100%
//39mb 50.68%
