package 链表;

import 链表.common.ListNode;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 下午8:06
 */
public class SwapNodesinPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }
}
