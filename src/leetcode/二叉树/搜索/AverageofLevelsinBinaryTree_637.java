package leetcode.二叉树.搜索;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午9:38
 *
 * 二叉树的层平均值
 */
public class AverageofLevelsinBinaryTree_637 {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int count = size;
            double sum = 0.0;
            while (size > 0) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                size--;
            }
            res.add(sum/count);
        }
        return res;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
