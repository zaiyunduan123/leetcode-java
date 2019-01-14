package 二叉树.搜索;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午8:45
 * 填充同一层的兄弟节点
 *
 * 给定完全二叉树，
 *    1
 *   /  \
 *  2    3
 * / \  / \
 * 4  5  6  7
 * 调用你的函数后，该完全二叉树变为：
 *     1 -> NULL
 *    /  \
 *   2 -> 3 -> NULL
 *  / \  / \
 * 4->5->6->7 -> NULL
 */
public class PopulatingNextRightPointersinEachNode_116 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    /**
     * 思路：
     * 1、对于其左子节点的处理方法是，由于是完全二叉树，所以若节点的左子结点存在的话，其右子节点必定存在，所以左子结点的next指针可以直接指向其右子节点
     * 2、对于其右子节点的处理方法是，判断其父节点的next是否为空，若不为空，则指向其next指针指向的节点的左子结点，若为空则指向NULL
     * @param root
     */
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        if (root.left != null) {
            // 1的left是2，1的right是3，所以2要指向3
            root.left.next = root.right;
        }
        if (root.next != null && root.right != null) {
            // 2的right是5，2的next的left是6，所以5要指向6
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }
}
