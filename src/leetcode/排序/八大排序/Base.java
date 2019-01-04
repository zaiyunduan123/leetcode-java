package leetcode.排序.八大排序;

/**
 * @Auther: Jesper
 * @Date: 2019/1/4 14:16
 * @Description:
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