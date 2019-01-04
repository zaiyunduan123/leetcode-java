package 字符串;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午2:09
 * <p>
 *
 * 字符的最短距离
 *
 * 1.从左边遍历找出最近距离
 * 2.从右边遍历找出最近距离
 * 3.选择最近
 */
public class ShortestToChar_821 {
    public int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];

        int pos = -n;
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                pos = i;
            }
            res[i] = i - pos;
        }
        for (int i = n - 1; i >= 0; --i) {
            if (S.charAt(i) == C) {
                pos = i;
            }
            res[i] = Math.min(res[i], Math.abs(i - pos));
        }
        return res;
    }
}
