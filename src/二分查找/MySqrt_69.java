package 二分查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 *
 *  x 的平方根
 */
public class MySqrt_69 {

    /**
     * 求开方
     * Leetcode : 69. Sqrt(x) (Easy)
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 1, r = x;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int sqrt = x / mid;
            if (sqrt == mid)
                return sqrt;
            if (sqrt > mid)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return r;
    }
}
