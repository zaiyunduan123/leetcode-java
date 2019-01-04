package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 上午1:17
 *
 * 宝石与石头
 */
public class NumJewelsInStones_771 {

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] js = J.toCharArray();
        char[] ss = S.toCharArray();


        Set set = new HashSet<>(js.length);
        for (char j : js){
            set.add(j);
        }
        for (char s : ss){
            if (set.contains(s)){
                result++;
            }
        }
        return result;
    }
}
