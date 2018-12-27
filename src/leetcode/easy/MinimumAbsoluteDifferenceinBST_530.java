package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午10:43
 * <p>
 * 二叉搜索树的最小绝对差
 */
public class MinimumAbsoluteDifferenceinBST_530 {

    int min = Integer.MAX_VALUE;
    Integer prev = null;

    public int getMinimumDifference(TreeNode root) {

        if (root == null) {
            return min;
        }
        getMinimumDifference(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        getMinimumDifference(root.right);
        return min;
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
