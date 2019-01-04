package 链表;

import 链表.common.ListNode;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class GetIntersectionNode_160 {

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
}
