package 字符串;

/**
 * @Author jiangyunxiong
 * @Date 2019/6/23 1:53 PM
 */
public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        LongestCommonPrefix_14 n = new LongestCommonPrefix_14();
        String a[] = {"c","acc","ccc"};
        String s = n.longestCommonPrefix(a);
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String pre = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(pre) != 0){//是否是前缀
                pre = pre.substring(0, pre.length()-1);
                if (pre.isEmpty()) return  "";
            }
        }
        return pre;
    }
}
