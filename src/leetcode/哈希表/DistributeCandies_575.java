package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午9:42
 *
 * 分糖果
 */
public class DistributeCandies_575 {
    public int distributeCandies(int[] candies) {
        Set set = new HashSet();
        for (int i=0;i<candies.length;i++){
            set.add(candies[i]);
        }
        return Math.min(set.size(), candies.length/2);
    }
}
