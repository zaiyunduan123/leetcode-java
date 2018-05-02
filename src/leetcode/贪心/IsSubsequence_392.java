package leetcode.贪心;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class IsSubsequence_392 {
    /**
     * 392 判断子序列
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * <p>
     * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
     * <p>
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * <p>
     * 示例 1:
     * s = "abc", t = "ahbgdc"
     * <p>
     * 返回 true.
     * <p>
     * 示例 2:
     * s = "axc", t = "ahbgdc"
     * <p>
     * 返回 false.
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int i = 0, j = 0;
        while (i < ch1.length && j < ch2.length) {
            if (ch1[i] == ch2[j])
                i++;
            j++;
        }
        return i == ch1.length - 1;
    }
}
