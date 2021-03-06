package 栈;


import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/27 下午9:53
 *
 * 判断括号是否合法
 */
public class ValidParentheses_20 {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char c : chars) {
            if (c == '('){
                stack.push(')');
            }else if (c == '{'){
                stack.push('}');
            }else if (c == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
       return stack.isEmpty();
    }
}
