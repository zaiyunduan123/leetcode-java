package 二分查找;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 上午8:05
 *
 * 给定四个长度相同的数组，在每个数组中取一个数字，在所有的组合中和为零的组合有多少个？
 */
public class Sum4_454 {

    /**
     * 思路：把四个数组分为两组，每组包含两个数组。把其中一组中的任意两个值和存入hashmap中，然后在hashmap查找另外两个数组的值的组合。这其实是相当于转化为了一个two sum问题。
     */
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<C.length;i++){
            for (int j =0;j<D.length;j++){
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }

        int res = 0;
        for (int i=0;i<A.length;i++){
            for (int j =0;j<B.length;j++){
                res += map.getOrDefault(-1*(A[i]+B[j]),0);
            }
        }
        return res;
    }

}
