package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 上午10:42
 */
public class UniqueMorseRepresentations_804 {
    public int uniqueMorseRepresentations(String[] words) {

        String[] map = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};


        Set<String> set = new HashSet<>();

        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                sb.append(map[chars[i]-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
