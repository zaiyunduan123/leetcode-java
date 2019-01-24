package 链表.删除;

/**
 * @Auther: Jesper
 * @Date: 2019/1/24 11:09
 * @Description: 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class RemoveNthNodeFromEndofList_19 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        remove(newhead, n);
        return newhead.next;
    }

    private int remove(ListNode node, int n) {
        if (node.next == null) return 1;
        int level = remove(node.next, n) + 1; //层数+1
        if (level == n+1){
            node.next = node.next.next;
        }
        return level;
    }
}
