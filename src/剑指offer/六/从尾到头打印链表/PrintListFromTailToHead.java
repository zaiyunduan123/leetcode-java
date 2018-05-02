package 剑指offer.六.从尾到头打印链表;

import 剑指offer.ListNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class PrintListFromTailToHead {
    /**
     * 输入一个链表，从尾到头打印链表每个节点的值。
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(list);
        return list;
    }
}
