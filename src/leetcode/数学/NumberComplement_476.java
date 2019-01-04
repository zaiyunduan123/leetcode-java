package 数学;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午6:11
 *
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 */
public class NumberComplement_476 {

    public static void main(String[] args) {
        NumberComplement_476 num = new NumberComplement_476();
        System.out.println(num.findComplement(12));
    }

    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~num;
        return num & mask;
    }
}
