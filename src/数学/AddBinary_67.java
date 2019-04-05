package 数学;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/5 9:36 AM
 *
 * 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）
 */
public class AddBinary_67 {
    /**
     * 用了两个指针分别指向a和b的末尾，然后每次取出一个字符，转为数字，若无法取出字符则按0处理，然后定义进位carry，初始化为0，将三者加起来，对2取余即为当前位的数字，对2取商即为当前进位的值，记得最后还要判断下carry，如果为1的话，要在结果最前面加上一个1。
     */
    public String addBinary(String a, String b) {
        String res = "";
        int m = a.length() - 1, n = b.length() - 1, carry = 0;
        while (m >= 0 || n >= 0) {
            int p = m >= 0 ? a.charAt(m--) - '0' : 0;
            int q = n >= 0 ? b.charAt(n--) - '0' : 0;
            int sum = p + q + carry;
            res = String.valueOf(sum % 2) + res;//当前数
            carry = sum / 2;  //进位数
        }
        return carry == 1 ? "1" + res : res;
    }
}
