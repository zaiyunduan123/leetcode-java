package 动态规划.SequenceDP;

/**
 * Created by jiangyunxiong on 2018/5/2.
 * <p>
 * 有 N 阶楼梯，每次可以上一阶或者两阶，求有多少种上楼梯的方法
 */
public class ClimbStairs_70 {

    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int p = 1, q = 2;
        for (int i = 2; i < n; i++) {
            int cur = p + q;
            p = q;
            q = cur;
        }
        return q;
    }
}
