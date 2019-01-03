package leetcode.栈;

import java.util.LinkedList;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午9:53
 * <p>
 * 问题：设计一个能返回栈中最小值的栈结构。
 * <p>
 * 思路：考虑使用另一个辅助栈，用来存储[0..i]的最小值。
 */
public class MinStack_155 {

    private LinkedList<Integer> list = new LinkedList<Integer>(); // 存储压入栈中的所有值
    private LinkedList<Integer> mins = new LinkedList<Integer>(); // 存储当前栈中的最小值


    public void push(int x) {
        //如果最小值栈中没有值，或者当前元素x比最小值栈中的最小值还要小，则把x放入最小值栈中
        if (mins.size() < 1 || mins.getLast() >= x) {
            mins.add(x);
        }
        list.add(x);
    }

    public void pop() {
        // pop 的时候，有可能 pop 出的是当前栈中的最小值。因此在 pop 函数操作时，需同时操作维护最小值的 linkedlist
        if (list.getLast().equals(mins.getLast())) {
            mins.removeLast();
        }
        list.removeLast();
    }

    public int top() {
        return list.getLast();
    }

    public int getMin() {
        return mins.getLast();
    }
}
