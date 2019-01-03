package leetcode.栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午10:36
 *
 * 基本计算器
 *
 * 思路：题目中只有+ - ( )。遍历字符串，对于每个字符c：
 *
 * 如果是数字，则一直遍历到非数字字符，把数字找出，并与结果相加
 * 如果是+``-符号，将符号位sign设置成对应的值
 * 如果是(，将res和sign压入栈中，重置res和sign
 * 如果是)，将sign和res弹出栈，并计算结果
 *
 */
public class BasicCalculator_224 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i) - '0';
                // 如果下一个还是数字，就继续计算
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    int next = s.charAt(i + 1) - '0';
                    num = num * 10 + next;
                    i++;
                }
                res += num * sign;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                res = res * stack.pop() + stack.pop();
            }
        }
        return res;
    }
}
