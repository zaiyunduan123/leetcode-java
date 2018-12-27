package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午5:30
 */
public class TreePostorderTraversal_590 {
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

    List<Integer> list = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root != null) {
            for(Node n : root.children){
                postorder(n);
            }
            list.add(root.val);
        }
        return list;
    }
}
