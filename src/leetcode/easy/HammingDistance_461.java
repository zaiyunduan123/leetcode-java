package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午12:23
 */
public class HammingDistance_461 {

    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }
}
