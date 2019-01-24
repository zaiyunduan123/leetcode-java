package 链表.合并;

/**
 * @Auther: Jesper
 * @Date: 2019/1/24 10:46
 * @Description: 两个链表求和，和也是一个链表（链表是逆序存的数字）   (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers_2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    /**
     * 思路：
     * 首先做个大循环，对每一位进行操作：
     * 当前位：(A[i]+B[i])%10
     * 进位：（A[i]+B[i]）/10
     * 逆序存的数字
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum/10 == 1){
            d.next = new ListNode(1);
        }
        return sentinel.next;
    }
}
