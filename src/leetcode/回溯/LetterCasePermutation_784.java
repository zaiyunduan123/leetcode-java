package leetcode.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午11:31
 * <p>
 * 字母大小写全排列
 * <p>
 * 回溯法, 遇到字母分大小写情况回溯, 遇到非字母直接回溯
 */
public class LetterCasePermutation_784 {

    public static void main(String[] args) {
        LetterCasePermutation_784 l = new LetterCasePermutation_784();
        System.out.println(l.letterCasePermutation("a1b2"));
    }

    public List<String> letterCasePermutation(String S) {
        List<String> ret = new ArrayList<>();
        bktrace(S.toCharArray(), ret, new StringBuilder(), 0);
        return ret;
    }


    private void bktrace(char[] s, List<String> ret, StringBuilder sb, int i) {
        if (i == s.length) {
            ret.add(sb.toString());
            return;
        }
        char c = s[i];
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            sb.append(Character.toLowerCase(c));
            bktrace(s, ret, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append(Character.toUpperCase(c));
            bktrace(s, ret, sb, i+1);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(c);
            bktrace(s, ret, sb, i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
