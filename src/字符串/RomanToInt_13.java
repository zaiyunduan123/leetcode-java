package 字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jiangyunxiong
 * @Date 2019/6/23 2:33 PM
 * <p>
 * <p>
 * 思路
 * 1. 首先将所有的组合可能性列出并添加到哈希表中
 * 2. 然后对字符串进行遍历，由于组合只有两种，一种是 1 个字符，一种是 2 个字符，其中 2 个字符优先于 1 个字符
 * 3. 先判断两个字符的组合在哈希表中是否存在，存在则将值取出加到结果 ans 中，并向后移2个字符。不存在则将判断当前 1 个字符是否存在，存在则将值取出加到结果 ans 中，并向后移 1 个字符
 * 4. 遍历结束返回结果 ans
 */
public class RomanToInt_13 {
    public static void main(String[] args) {
        RomanToInt_13 r = new RomanToInt_13();
        r.romanToInt("III");
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int res = 0;
        for (int i = 0; i < s.length(); ) {
            if (s.length() > i + 1 && map.containsKey(s.substring(i, i + 2))) {
                res += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                res += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return res;
    }
}
