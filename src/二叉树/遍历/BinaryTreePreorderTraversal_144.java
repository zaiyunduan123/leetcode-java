package 二叉树.遍历;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:03
 *
 * 二叉树前序遍历
 *
 * 思路：用一个栈来实现，由于遍历过程中要先访问树的左子树，而后右子树，所以实现的时候先把根节点的右孩子入栈，而后是左孩子。
 */
public class BinaryTreePreorderTraversal_144 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s =new Stack<>();
        if(root != null)
            s.push(root);

        while(!s.isEmpty()){
            TreeNode temp = s.pop();
            result.add(temp.val);

            if(temp.right!=null)
                s.push(temp.right);
            if(temp.left!=null)
                s.push(temp.left);
        }
        return result;
    }
}
