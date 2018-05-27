package leetcode.字符串;

import java.util.ArrayList;

/**
 * Created by jiangyunxiong on 2018/5/3.
 */
public class GenerateParentheses_22 {
    /**
     * 22. 括号生成
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * <p>
     * For example, given n = 3, a solution set is:
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     */
    ArrayList<String> r = new ArrayList<>();

    public ArrayList<String> generateParenthesis(int n) {
        //保证左边‘（’的数量始终大于等于右边的‘）’数量，可以考虑回溯法
        gp("", 0, 0, n);
        return r;
    }

    private void gp(String s, int left, int right, int n) {
        if (right == n) {
            r.add(s);
        }
        if (left < n) {
            gp(s + "(", left + 1, right, n);
            // 递归过程中 左括号x的个数必须大于等于右括号个数
            if (left > right) {
                gp(s + ")", left, right + 1, n);
            }
        }
    }

    public static void main(String[] args) {
        GenerateParentheses_22 g = new GenerateParentheses_22();
        System.out.println(g.generateParenthesis(2));
    }
}