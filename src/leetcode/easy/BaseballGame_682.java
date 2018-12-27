package leetcode.easy;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午5:11
 */
public class BaseballGame_682 {

    public static void main(String[] args) {

        String[] str  = {"5","2","C","D","+"};
        BaseballGame_682 b = new BaseballGame_682();
        System.out.println(b.calPoints(str));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for (String s : ops) {
            if (s.charAt(0) == 'C') {
                int x = stack.pop();
                sum -= x;
            } else if (s.charAt(0) == 'D') {
                int x = stack.peek();
                int n = 2 * x;
                sum += n;
                stack.push(n);
            } else if (s.charAt(0) == '+') {
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                int n = (x + y);
                sum += n;
                stack.push(n);
            } else {
                int x = Integer.parseInt(s);
                sum += x;
                stack.push(x);
            }
        }

        return sum;
    }
}