package leetcode.二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午8:47
 *
 * 二叉树的最小公共祖先
 */
public class LowestCommonAncestorofBinaryTree_236 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p == root || q == root) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }
        return left == null ? right : left;

    }
}
