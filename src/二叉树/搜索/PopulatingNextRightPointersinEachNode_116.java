package 二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午8:45
 *
 * 填充同一层的兄弟节点
 */
public class PopulatingNextRightPointersinEachNode_116 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        if(root.left != null){
            // 1的left是2，1的right是3，所以2要指向3
            root.left.next = root.right;
        }
        if(root.next != null && root.right != null){
            // 2的right是5，2的next的left是6，所以5要指向6
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }
}
