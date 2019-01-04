package 链表;


/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class ReverseList_77 {

    /**
     * 链表反转  1、递归
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode next = head.next;
        ListNode newHead = reverseList(next);
        next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 链表反转  2、头插法
     */
    public ListNode reverseList1(ListNode head){
        ListNode newHead = new ListNode(-1);
        while(head != null){
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }

    class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
