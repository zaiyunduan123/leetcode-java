package 深度优先搜索;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午2:07
 *
 * 递增顺序查找树
 */
public class IncreasingOrderSearchTree_897 {

    TreeNode newTree, head;

    public TreeNode increasingBST(TreeNode root) {

        newTree = new TreeNode(0);
        head = newTree;
        traversal(root);
        return head.right;
    }

    private void traversal(TreeNode root){
        if (root == null)
            return;

        traversal(root.left);
        newTree.right = new TreeNode(root.val);
        newTree = newTree.right;
        traversal(root.right);
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
