package 深度优先搜索;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午8:10
 *
 * 二叉树的最大深度
 */
public class MaximumDepthofBinaryTree_104 {
    public int maxDepth(TreeNode root) {
         if (root == null){
            return 0;
         }
         return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
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
