package 二叉树.层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:32
 * <p>
 * 二叉树的层序遍历(从下到上)
 *
 * 思路：只要在普通的层序遍历代码中修改一处：results.add(0, level);，这样每次头插到结果中。
 */
public class BinaryTreeLevelOrderTraversalII_107 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //记录每行
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            res.add(0, level);
        }
        return res;
    }
}
