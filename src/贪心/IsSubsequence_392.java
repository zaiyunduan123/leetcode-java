package 贪心;

/**
 * Created by jiangyunxiong on 2018/5/2.
 *  判断子序列
 *  给定字符串 s 和 t ，判断 s 是否为 t 的子序列
 */
public class IsSubsequence_392 {

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
