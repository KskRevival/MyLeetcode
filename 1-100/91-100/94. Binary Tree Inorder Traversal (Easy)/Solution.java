import java.util.ArrayList;
import java.util.List;

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) axe(root);
        return list;
    }

    public void axe(TreeNode root){
        if (root.left != null) axe(root.left);
        list.add(root.val);
        if (root.right != null) axe(root.right);
    }
}
//0ms 100%
//37.2mb 68.18%
