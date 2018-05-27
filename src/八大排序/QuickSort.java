package 八大排序;

/**
 * Created by jiangyunxiong on 2018/5/27.
 */
public class QuickSort extends Base {

    /**
     * 快速排序
     * <p>
     * 快速排序通过一个基准元素将数组分为两个子数组，左子数组小于等于基准元素，右子数组大于等于基准元素，将这两个子数组排序也就将整个数组排序了。
     */
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int l, int h) {
        if (h <= l)
            return;
        int j = partition(a, l, h);
        sort(a, l, j - 1);
        sort(a, j + 1, h);
    }

    private static int partition(int[] a, int l, int h) {
        int i = l, j = h + 1;
        int v = a[l];
        while (true) {
            while (compare(a[++i], v) && i != h) ;
            while (compare(v, a[--j]) && j != l) ;
            if (i >= j)
                break;
            swap(a, i, j);
        }
        swap(a, l, j);
        return j;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        QuickSort.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
