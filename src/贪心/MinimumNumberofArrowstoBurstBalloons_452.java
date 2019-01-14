package 贪心;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/20 下午10:27
 *
 * 投飞镖刺破气球
 *
 */
public class MinimumNumberofArrowstoBurstBalloons_452 {

    /**
     * 思路：先计算最多能组成的不重叠区间个数，然后用区间总个数减去不重叠区间的个数。
     */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int num =1 , end = points[0][1];
        for(int i=1;i<points.length;i++){
            if (points[i][0]<=end){
                continue;
            }
            end = points[i][1];
            num ++;
        }
        return  num;
    }
}
