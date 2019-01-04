package 二叉树.性质;


/**
 * @Author jiangyunxiong
 * @Date 2018/12/31 上午10:10
 * <p>
 * 2个结点之间的最长路径
 *
 * 1、前序遍历
 * 2、求根结点到所有叶子结点的pathsum，遍历整颗树
 * 3、求根结点到叶子结点的最大深度
 */
public class BinaryTreeMaximumPathSum_124 {

    int ans;

    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;
         maxDeep(root);
        return ans;
    }

    public int maxDeep(TreeNode root) {
        if (root == null) return 0;
        //叶子结点
        if (root.left == null && root.right == null) {
            ans = Math.max(ans, root.val);
            return root.val;
        } else {
            int left = maxDeep(root.left);
            int right = maxDeep(root.right);
            int tmp = Math.max(left, right) + root.val;
            tmp = Math.max(tmp, root.val);

            ans = Math.max(ans, tmp);
            ans = Math.max(ans, left+right+root.val);
            return tmp;
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
