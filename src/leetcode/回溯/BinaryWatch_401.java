package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午11:23
 */
public class BinaryWatch_401 {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
//                技术整型i二进制表示中1的个数。
                if (Integer.bitCount(h * 64 + m) == num) {
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        return times;
    }
}
