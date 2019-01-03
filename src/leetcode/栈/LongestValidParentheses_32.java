package leetcode.栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午9:21
 *
 * 最长有效括号（考察点：栈/动态规划）
 *
 * 用栈存放左括号的下标，遇到左括号，将其下标存入栈中。
 * 遇到右括号，若此时栈为空，说明这个不是有效括号对里的，跳过，更新有效括号的起始点；
 * 若是栈不为空，则栈顶元素出栈。此时，若栈为空，后面不一定没有接合法的有效括号对，所以，计算当前和有效括号起始点的距离，并更新最大值
 */
public class LongestValidParentheses_32 {
    public static void main(String[] args) {
        LongestValidParentheses_32 l = new LongestValidParentheses_32();
        System.out.println(l.longestValidParentheses(")()())"));
    }
    public int longestValidParentheses(String s) {
        //存放每一个左括号的位置
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        // 当前括号组合的最左侧边界
        int start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                //当前括号组合为空
                if (stack.empty()) {
                    start = i;
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        res = Math.max(res, i - start);
                    } else {
                        res = Math.max(res, i - stack.peek());
                    }
                }
            }
        }
        return res;
    }
}
