package 链表.反转;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/29 下午9:55
 * 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */
public class RotateRight_61 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 思路：
     * <p>
     * 1. 先求出整个链表的长度
     * 2. 根据k值找到需要移动的部分链表的前驱(l-n%l)
     * 3. 在前驱之后将链表断开，移动后半部分
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        int i;
        for (i = 0; fast.next != null; i++) {
            fast = fast.next;
        }
        for (int j = i - k % i; j > 0; j--) {
            slow = slow.next;
        }
        fast.next = dummy.next;//翻转
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;
    }
}
