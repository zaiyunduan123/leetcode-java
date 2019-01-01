package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/27 下午8:54
 */
public class DeleteNodeInLinkedList_237 {

    public void deleteNode(ListNode node) {
          node.val = node.next.val;
          node.next = node.next.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
