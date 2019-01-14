package 二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午10:43
 * <p>
 * 二叉搜索树的最小绝对差
 *
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值
 */
public class MinimumAbsoluteDifferenceinBST_530 {

    int min = Integer.MAX_VALUE;
    Integer prev = null;

    /**
     * 思路：中序遍历二分搜索树，计算当前节点数据与上一个节点数据的绝对值的差值，遍历结束返回最小的绝对值差值
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
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
