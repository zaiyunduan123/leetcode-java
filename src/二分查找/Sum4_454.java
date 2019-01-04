package 二分查找;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 上午8:05
 *
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 */
public class Sum4_454 {
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
