package 二叉树.性质;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午7:09
 *
 * 修剪二叉搜索树
 *
 * 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (L<=R)
 */
public class TrimBinarySearchTree_669 {


    /**
     * 思路：递归修剪，根据二叉搜索树的特性，根的值大于左子结点，小于右子结点，得出：
     * 1、如果root.val小于L的值，则直接舍弃左子树，返回继续修剪以root.right为根结点的右子树；
     * 2、如果root.val大于R的值，则直接舍弃右子树，返回继续修剪以root.left为根结点的左子树；
     * 3、在[L, R]范围内，则继续修剪左子树和右子树，然后返回root.
     */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val < L) {
            return trimBST(root.right, L, R);
        } else if (root.val > R) {
            return trimBST(root.left, L, R);
        } else {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
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

