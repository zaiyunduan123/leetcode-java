package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 上午10:18
 */
public class ToLowerCase_709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if ('A' <= chars[i] && chars[i] <= 'Z'){
                chars [i]= (char) (chars[i] - 'A' + 'a');
            }
        }
        return chars.toString();

    }
}
