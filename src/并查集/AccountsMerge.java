package 并查集;


/**
 * Created by jiangyunxiong on 2018/4/23.
 */
public class AccountsMerge {

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


    /**
     * 摆硬币
     Leetcode : 441. Arranging Coins (Easy)
     * @param n
     * @return
     */
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


    public static void main(String[] args) {
        AccountsMerge a = new AccountsMerge();
//        System.out.println(a.mySqrt(8));
        System.out.println(a.arrangeCoins(8));
    }
}
