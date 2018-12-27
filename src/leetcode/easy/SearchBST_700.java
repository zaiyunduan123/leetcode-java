package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午5:42
 */
public class SearchBST_700 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && root.val != val){
            root = root.val>val?root.right:root.left;
        }
        return root;
    }
}
