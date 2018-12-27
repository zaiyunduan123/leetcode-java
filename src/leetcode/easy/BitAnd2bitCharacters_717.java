package leetcode.easy;

import java.util.HashMap;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/25 上午12:09
 * <p>
 * 1比特与2比特字符
 *
 * 因为两种字符互不干扰，只要我们遍历到了数字1，那么其必定是两位字符，所以后面一位也得跟着，而遍历到了数字0，那么就必定是单个位字符。所以我们可以用一个变量i来记录当前遍历到的位置，如果遇到了0，那么i自增1，如果遇到了1，那么i自增2，我们循环的条件是i < n-1，即留出最后一位，所以当循环退出后，当i正好停留在n-1上，说明最后一位是单独分割开的，因为题目中限定了最后一位一定是0，所以没必要再判断了
 */
public class BitAnd2bitCharacters_717 {

    public static void main(String[] args) {
        BitAnd2bitCharacters_717 b = new BitAnd2bitCharacters_717();
        int[] str = {0, 1, 0};
        System.out.println(b.isOneBitCharacter(str));
    }

    public boolean isOneBitCharacter(int[] bits) {

        int n = bits.length, i = 0;
        while (i < n - 1) {
            if (bits[i] == 0) ++i;
            else i+= 2;
        }
        return i == n - 1;

    }
}
