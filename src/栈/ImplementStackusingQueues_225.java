package 栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午9:47
 *
 * 用队列实现栈
 */
public class ImplementStackusingQueues_225 {

    private Queue<Integer> queue = new LinkedList<>();


    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offer(x);
        // 入队后反转
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
