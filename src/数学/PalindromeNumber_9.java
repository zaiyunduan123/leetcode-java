package 数学;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/5 9:57 AM
 *
 * 回文数
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class PalindromeNumber_9 {
    /**
     * 思路：如果 计算 1221 / 1000， 则可得首位1， 如果 1221 % 10， 则可得到末尾1，进行比较，然后把中间的22取出继续比较。
     */
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int div = 1;
        while (x / div >= 10)
            div *= 10;// 取数字的首位数字
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right)
                return false;
            x = (x % div) / 10; // 去掉头和尾
            div /= 100; // div除于两位
        }
        return true;
    }
}
