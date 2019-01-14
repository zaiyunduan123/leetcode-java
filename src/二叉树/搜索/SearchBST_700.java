package 二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午5:42
 * <p>
 * 二叉搜索树中的搜索
 * <p>
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */
public class SearchBST_700 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = root.val > val ? root.right : root.left;
        }
        return root;
    }
}
