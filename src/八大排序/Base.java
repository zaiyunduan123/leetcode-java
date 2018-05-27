package 八大排序;

/**
 * Created by jiangyunxiong on 2018/5/27.
 */
public class Base {

    /**
     * 比较
     */
    public static boolean compare(int s, int m) {
        return s < m;
    }

    /**
     * 交换
     */
    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
