package 并查集;


/**
 * Created by jiangyunxiong on 2018/4/28.
 */
public class LinkedList {

    /**
     * 找出两个链表的交点
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while (l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }

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

    /**
     * 合并两个有序链
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val < l2.val){
             l1.next = mergeTwoLists(l1.next, l2);
             return l1;
         }else {
             l2.next = mergeTwoLists(l1, l2.next);
             return l2;
         }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}