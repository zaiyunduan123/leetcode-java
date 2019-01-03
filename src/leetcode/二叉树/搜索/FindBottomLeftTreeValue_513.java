package leetcode.二叉树.搜索;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:59
 *
 * 问题：找到二叉树的最后一层的最左边的值
 */
public class FindBottomLeftTreeValue_513 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int findBottomLeftValue(TreeNode root) {
        int res = 0;
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // 每一次最左边结点值
                if(i == 0) res = node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }
        return res;
    }
}
