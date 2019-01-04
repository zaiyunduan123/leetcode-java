package 二分查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 * 摆硬币
 */
public class ArrangeCoins_441 {

    public int arrangeCoins(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sqrt = mid * (mid + 1) / 2;
            if (sqrt == n)
                return mid;
            if (sqrt < n)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r;
    }
}
