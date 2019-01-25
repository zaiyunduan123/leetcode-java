package 二叉树.遍历;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:17
 * <p>
 * 二叉树后序遍历
 */
public class BinaryTreePostorderTraversal_145 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 思路：
     * 二叉树的后序遍历顺序为，root->left, root->right, root，因此需要保存根节点的状态。
     * 对于节点p可以分情况讨论
     * 1. p如果是叶子节点，直接输出
     * 2. p如果有孩子，且孩子没有被访问过，则按照右孩子，左孩子的顺序依次入栈
     * 3. p如果有孩子，而且孩子都已经访问过，则访问p节点
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode p = root, r = null;//p记录当前节点，r记录上一次访问节点
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (p != null || !s.isEmpty()) {
            if (p != null) {//左孩子一直入栈，直到左孩子为空
                s.push(p);
                p = p.left;
            } else {
                p = s.peek();
                p = p.right;
                if (p != null && p != r) {//如果栈顶元素的左孩子不为空，且
                    s.push(p);
                    p = p.left;
                } else {
                    p = s.pop();
                    list.add(p.val);
                    r = p;
                    p = null;
                }
            }
        }
        return list;
    }
}
