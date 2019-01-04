package 递归;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class Reverse {
    /**
     * 用递归实现字符串倒置
     * @param str
     * @return
     */
    public String reverse(String str){
        if((null == str) || (str.length() <= 1))
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
