package leetcode.二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 上午9:01
 */
public class CountCompleteTreeNodes_222 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 完全二叉数的高度可以通过不断地访问左子树就可以获取
     * 判断左右子树的高度
     * 如果相等说明左子树是满二叉树，然后进一步判断右子树的节点树（最后一层最后出现的节点必然在右子树中）
     * 如果不等说明右子树是深度小于左子树的满二叉树, 然后进一步判断左子树的节点数(最后一层最后出现的节点必然在左子树中)
     *
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int ld = height(root.left);
        int rd = height(root.right);
        if (ld == rd) {
            // 1(根节点) + (1 << ld)-1(左完全左子树节点数) + 右子树节点数量
            return (1 << ld) + countNodes(root.right);
        }else{
            // 1(根节点) + (1 << rd)-1(右完全右子树节点数) + 左子树节点数量
            return (1<<rd) + countNodes(root.left);
        }
    }

    int height(TreeNode root) {
        int depth = 0;
        while (root != null) {
            depth++;
            root = root.left;
        }
        return depth;
    }

}
