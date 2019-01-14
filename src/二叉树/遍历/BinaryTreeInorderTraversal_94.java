package 二叉树.遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:06
 * <p>
 * 二叉树中序遍历
 *
 */
public class BinaryTreeInorderTraversal_94 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    /**
     * 思路：由于二叉树中序遍历要先遍历左孩子，再是根节点，最后是右孩子。
     * 所以算法先找到根节点的最左孩子，把一路下来的左孩子依次入栈，访问最左孩子，而后是访问根节点，然后把根节点右孩子当做当前节点。重复上述过程直到节点都访问完。
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while (!s.isEmpty() || p != null) {
            // 左孩子依次入栈，访问最左孩子
            if (p != null) {
                s.push(p);
                p = p.left;
            } else {
                p = s.pop();
                result.add(p.val);
                // 把根节点右孩子当做当前节点
                p = p.right;
            }
        }
        return result;
    }
}
