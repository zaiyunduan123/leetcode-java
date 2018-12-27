package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午8:03
 */
public class FizzBuzz_412 {
    public static void main(String[] args) {
        FizzBuzz_412 f = new FizzBuzz_412();
        System.out.println(f.fizzBuzz(1));
    }

    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0){
                res.add("Buzz");
            }else {
                res.add(i+"");
            }
        }
        return res;
    }
}
