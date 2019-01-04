package 二叉树.搜索;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/2 下午10:50
 *
 * 题目：返回二叉树每层的最右边节点的值
 *
 * 思路：每次把每层的最右边一个节点的值添加到results中
 */
public class BinaryTreeRightSideView_199 {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // 每次把每层的最右边一个节点的值添加到results中
                if(i == size - 1) res.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }
        return res;
    }
}
