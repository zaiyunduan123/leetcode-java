package 栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/26 上午8:12
 *
 * 比较含退格的字符串
 */
public class BackspaceStringCompare_844 {

    public boolean backspaceCompare(String S, String T) {
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for (char n : s){
            if (n == '#' && !stack1.isEmpty()){
                stack1.pop();
            }else {
                stack1.push(n);
            }
        }
        for (char n : t){
            if (n == '#' && !stack2.isEmpty()){
                stack2.pop();
            }else {
                stack2.push(n);
            }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if (stack1.pop() != stack2.pop()){
                return false;
            }else if (stack1.isEmpty() && stack2.isEmpty()){
                return true;
            }
        }

         return false;

    }
}
