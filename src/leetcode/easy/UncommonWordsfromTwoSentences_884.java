package leetcode.easy;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午1:41
 *
 * 两个数组中只出现过一次的数
 */
public class UncommonWordsfromTwoSentences_884 {

    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (A + " " + B).split(" "))
            count.put(w, count.getOrDefault(w, 0) + 1);
        ArrayList<String> res = new ArrayList<>();
        for (String w : count.keySet())
            if (count.get(w) == 1)
                res.add(w);
        return res.toArray(new String[0]);
    }
}
