package 链表;

import 链表.common.ListNode;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class MergeTwoLists_21 {
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
