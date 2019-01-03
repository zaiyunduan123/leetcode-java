package leetcode.栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午9:33
 *
 * 用两个栈实现队列
 */
public class ImplementQueueusingStacks_232 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    /**
     * 队列的 push() 操作，就直接在 stack1 上进行栈的 push() 操作即可
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * 队列的 pop() 操作，其实就是得到 stack1 中最底下的那个元素，怎么得到呢？先把上面逐个退出的元素一个个放在另一个栈 stack2 中；
     * 当 stack1 为空的时候，stack2 的栈顶元素，就是要取得的元素，用栈的 pop() 操作取出
     * 在将该元素进行返回前，再将 stack2 中的元素倒回到 stack1 中，然后将该元素返回
     */
    public int pop() {
        // 如果stack2为空
        if (stack2.isEmpty()) {
            // 且stack1不为空
            while (!stack1.isEmpty()) {
                // 则不断把stack1中的元素pop出来，并push到stack2中暂存
                stack2.push(stack1.pop());
            }
        }
        // stack2的栈顶元素其实就是stack1的栈底元素，我们要pop队列的队首元素其实也就是pop栈的栈底元素
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
