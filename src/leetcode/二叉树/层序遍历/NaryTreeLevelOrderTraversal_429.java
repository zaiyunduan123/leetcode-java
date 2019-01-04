package 二叉树.层序遍历;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午8:38
 * <p>
 * N叉树的层序遍历
 */
public class NaryTreeLevelOrderTraversal_429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> eachLayer = new LinkedList<>();
            int layerSize = queue.size();
            for (int i = 0; i < layerSize; ++i) {
                Node temp = queue.poll();
                eachLayer.add(temp.val);
                for (Node node : temp.children) {
                    queue.offer(node);
                }
            }
            res.add(eachLayer);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}



