package leetcode.并查集;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/31 上午9:53
 */
public class PathSum_112 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)return false;
        if (root.left==null &&root.right==null){
           return sum-root.val==0;
        }

        return hasPathSum(root.left, sum-root.val)||
                hasPathSum(root.right, sum-root.val);
    }
}
