package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午9:42
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
