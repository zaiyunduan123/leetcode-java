package 贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jiangyunxiong on 2018/5/2.
 *
 * 根据身高重建队列
 */
public class ReconstructQueue_406 {

    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) return new int[0][0];
        //身高降序、k 值升序
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        int N = people.length;
        //为了在每次插入操作时不影响后续的操作，身高较高的学生应该先做插入操作，否则身高较小的学生原先正确插入第 k 个位置可能会变成第 k+1 个位置。
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int index = people[i][1];
            int[] p = new int[]{people[i][0], people[i][1]};
            tmp.add(index, p);
        }

        int[][] ret = new int[N][2];
        for (int i = 0; i < N; i++) {
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }
}
