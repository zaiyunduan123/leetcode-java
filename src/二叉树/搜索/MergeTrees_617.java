package 二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午12:52
 *
 * 合并二叉树
 *
 * 合并的树的每一个点的值等于两个二叉树相对位置的点的值的合
 */
public class MergeTrees_617 {

    TreeNode n = null;

    /**
     * 思路：前序遍历两棵二叉树
     * 1、节点都为空，return null，
     * 2、有一个结点为空，取不为空的结点值作为结点值，
     * 3、两棵二叉树的结点都不为空时，取两个结点相加所得的值作为结点值
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null) {
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode newNode = new TreeNode(val);

        newNode.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        newNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

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
