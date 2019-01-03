package leetcode.二叉树.层序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:28
 * <p>
 * 二叉树的层序遍历(从上到下)
 *
 * 基础模版代码，其他各种各样的层序搜索题都是本题的变种，稍微在本题代码上修改一下即可
 */
public class BinaryTreeLevelOrderTraversal_102 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
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
            res.add(level);
        }
        return res;
    }
}
