package 二分查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 * 摆硬币
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。给定一个数字 n，找出可形成完整阶梯行的总行数。
 */
public class ArrangeCoins_441 {

    /**
     * 解法一
     * <p>
     * 时间复杂度：O(log2n)
     * 思路：因为每个行硬币个数是逐行递增，所以使用二分查找，比较前mid行之和 与 n ，如果相等返回mid
     */
    public int arrangeCoins(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sqrt = mid * (mid + 1) / 2;//前mid行之和
            if (sqrt == n)
                return mid;
            if (sqrt < n)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r;
    }

    /**
     * 解法二
     * <p>
     * 时间复杂度：O(1)
     * 思路：充分利用了等差数列的性质，我们建立等式, n = (1 + x) * x / 2, 我们用一元二次方程的求根公式可以得到 x = (-1 + sqrt(8 * n + 1)) / 2, 然后取整后就是能填满的行数
     */
    public int arrangeCoins2(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
    }
}
