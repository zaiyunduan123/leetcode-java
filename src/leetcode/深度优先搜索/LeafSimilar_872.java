package 深度优先搜索;


/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午12:12
 *
 * 叶子相似的树
 */
public class LeafSimilar_872 {


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         return preOrder(root1).equals(preOrder(root2));
    }

    private String preOrder(TreeNode root){
        if (root == null)
            return "";
        if (root.left == null && root.right == null){
            return root.val+"";
        }
        return preOrder(root.left) + preOrder(root.right);
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
