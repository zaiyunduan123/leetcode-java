package leetcode.easy;

import java.util.Arrays;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午12:33
 */
public class DiStringMatch_942 {
    public static void main(String[] args) {
        DiStringMatch_942 s =new DiStringMatch_942();
        System.out.println(Arrays.toString(s.diStringMatch("III")));
    }

    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] str = new int[n + 1];
        int left =0;
        int right = n;
        char[] chars = S.toCharArray();
        for (int i=0;i< n;i++){
            str[i] = chars[i] == 'I'?left++:right--;
        }
        int i = str[n - 1];
        str[n] = chars[n-1] == 'I'? i+1:i-1;
        return str;
    }
}
