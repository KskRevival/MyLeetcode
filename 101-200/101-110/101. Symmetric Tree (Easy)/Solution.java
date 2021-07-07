class Solution {
    private boolean check = true;

    public boolean isSymmetric(TreeNode root) {
        compare(root.left, root.right);
        return check;
    }

    private void compare(TreeNode left, TreeNode right){
        check = check && (left == null) == (right == null);
        boolean exist = left != null;
        if (exist && check) check = left.val == right.val;
        if (exist && check){
            compare(left.right, right.left);
            compare(left.left, right.right);
        }
    }
}
//0ms 100%
//36.8mb 89.75%
