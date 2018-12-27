package leetcode.分治;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/20 下午11:24
 *
 * 给表达式加括号
 *
 * 241. Different Ways to Add Parentheses (Medium)
 *
 * Input: "2-1-1".
 *
 * ((2-1)-1) = 0
 * (2-(1-1)) = 2
 *
 * Output : [0, 2]
 */
public class DiffWaysToCompute_241 {

    public static void main(String[] args) {
        DiffWaysToCompute_241 n = new DiffWaysToCompute_241();
        n.diffWaysToCompute("2-1-1");
    }

    public List<Integer> diffWaysToCompute(String input) {

        List<Integer> ways = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c) {
                            case '+':
                                ways.add(l + r);
                                break;
                            case '-':
                                ways.add(l - r);
                                break;
                            case '*':
                                ways.add(l * r);
                                break;
                        }
                    }
                }
            }
        }
        if (ways.size() == 0) {
            ways.add(Integer.valueOf(input));
        }
        return ways;
    }
}
