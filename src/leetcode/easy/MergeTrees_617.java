package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午12:52
 */
public class MergeTrees_617 {

    TreeNode n = null;

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null){
            return null;
        }
        int val = (t1 == null ? 0:t1.val) + (t2 == null ? 0: t2.val);
        TreeNode newNode = new TreeNode(val);

        newNode.left = mergeTrees(t1 == null?null:t1.left, t2 == null ? null:t2.left);
        newNode.right = mergeTrees(t1 == null?null:t1.right, t2 == null ? null:t2.right);

        return newNode;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
