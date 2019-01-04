package 栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午10:04
 *
 * 逆波兰表达式求值
 *
 * 思路：只需要定义一个stack，如果是+, -, *, /四个运算符，就取出栈顶的两个数，进行相应操作，之后将计算得到的结果压入栈中；
 * 如果是数字，就直接入栈。最终stack只剩下一个元素，这个元素就是逆波兰表达式的值
 */
public class EvaluateReversePolishNotation_150 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<Integer>();

        for(int i=0;i<tokens.length;i++){

            try{
                int num=Integer.parseInt(tokens[i]);
                s.push(num);
            }catch(Exception e){
                int b=s.pop();
                int a=s.pop();
                s.push(get(a,b,tokens[i]));
            }

        }
        return s.pop();
    }
    private int get(int a,int b,String operation){
        switch(operation){
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "-":
                return a-b;
            case "+":
                return a+b;
            default:
                return 0;
        }
    }
}
