class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q,true);
    }

    public boolean check(TreeNode a, TreeNode b, boolean isSame){
        if (isSame){
            if (a != null && b != null){
                isSame = a.val == b.val && check(a.left,b.left,isSame) && check(a.right,b.right,isSame);
            } else isSame = (a == null) == (b == null);
        }
        return isSame;
    }
}
//0ms 100%
//36.2mb 69.37%
