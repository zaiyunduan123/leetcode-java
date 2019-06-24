package 二叉树.性质;

/**
 * @Author jiangyunxiong
 * @Date 2019/6/23 9:00 PM
 * <p>
 * Bottom-up 提前阻断法（复杂度 O(N)）
 * 在对root做dfs时，会从下至上获得每个root的左右子树高度，当我们发现有一例左右子树高度差 ＞1的情况时return -1，代表此树不是平衡树，后面的高度计算都没有意义了，之后一路return -1，不再做后面的DFS。
 */
public class BalanceTree_110 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        if (left == -1) return -1;
        int right = height(root.right);
        if (right == -1 || Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }
}
