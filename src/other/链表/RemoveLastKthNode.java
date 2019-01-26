package other.链表;

/**
 * @Auther: Jesper
 * @Date: 2019/1/26 11:38
 * @Description: 在单链表和双链表中删除倒数第k个节点
 */
public class RemoveLastKthNode {
    class Node {
        public int value;
        public Node next;

        public Node(int data){
            this.value = data;
        }
    }

    /**
     * @param head
     * @param lastKth
     * @return
     */
    public Node removeLastKthNode(Node head,int lastKth){
        if (head == null || lastKth < 1){
            return head;
        }
        Node cur = head;
        while (cur != null){
            lastKth--;
            cur = cur.next;
        }
        if (lastKth == 0){
            head = head.next;
        }
        if (lastKth < 0){
            cur =  head;
            while (++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;

    }
}
