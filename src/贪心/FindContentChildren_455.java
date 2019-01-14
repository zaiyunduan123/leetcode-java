package 贪心;

import java.util.Arrays;

/**
 * Created by jiangyunxiong on 2018/5/2.
 *
 * 分发饼干
 */
public class FindContentChildren_455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i])
                i++;
            j++;
        }
        return i;
    }
}
