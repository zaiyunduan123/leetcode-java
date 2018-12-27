package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午7:35
 * 不需要将整数转二进制,直接用整数不断除以2
 */
public class BinaryGap_868 {

    public static void main(String[] args) {
        BinaryGap_868 b = new BinaryGap_868();
        System.out.println(b.binaryGap(22));
    }

    public int binaryGap(int N) {
        int res = 0;
        for (int d = -1; N > 0; N /= 2, d++) {
            if (N % 2 == 1) {
                res = Math.max(res, d);
                d = 0;
            }
        }
        return res;
    }

}
