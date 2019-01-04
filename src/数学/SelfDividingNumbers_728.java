package 数学;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午1:31
 *
 * 自除数 是指可以被它包含的每一位数除尽的数。
 */
public class SelfDividingNumbers_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) {
                list.add(i);
                continue;
            }
            if (vaild(i)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean vaild(int n) {
        int cache = n;
        while (n > 1) {
            int remain = n%10;
            if (remain == 0){
                return false;
            }
            if (cache % remain != 0){
                return false;
            }
            n = (n -remain) /10;
        }
        return true;
    }

}
