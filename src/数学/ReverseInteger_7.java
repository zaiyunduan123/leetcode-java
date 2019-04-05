package 数学;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/5 9:58 AM
 *
 * 整数反转
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        if (x == 0)
            return x;
        int ret = 0;
        while (x != 0) {
            if (ret > 2147483647 / 10 || ret < -2147483647 / 10)
                return 0;
            ret = ret * 10 + x % 10;
            x = x / 10;
        }
        return ret;
    }
}
