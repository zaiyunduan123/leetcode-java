package 排序.八大排序;

/**
 * @Auther: Jesper
 * @Date: 2019/1/4 14:17
 * @Description: 归并排序
 * <p>
 * 归并排序的思想是将数组分成两部分，分别进行排序，然后归并起来。
 */
public class MergeSort extends Base {

    private static int[] aux;

    private static void merge(int[] a, int l, int m, int h) {
        int i = l, j = m + 1;

        for (int k = l; k <= h; k++)
            aux[k] = a[k];//将数据复制到辅助数组

        for (int k = l; k <= h; k++) {
            if (i > m)
                a[k] = aux[j++];
            else if (j > h)
                a[k] = aux[i++];
            else if (compare(aux[i], a[j]))
                a[k] = aux[i++]; // 先进行这一步，保证稳定性
            else
                a[k] = aux[j++];
        }
    }

    /**
     * 自顶向下归并排序
     *
     * @param a
     */
    public static void sortUpDown(int[] a) {
        aux = new int[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int l, int h) {
        if (h <= l)
            return;
        int mid = l + (h - l) / 2;
        sort(a, l, mid);
        sort(a, mid + 1, h);
        merge(a, l, mid, h);
    }

    /**
     * 自底向上归并排序
     * 先归并那些微型数组，然后成对归并得到的微型数组。
     *
     * @param a
     */
    public static void sortDownUp(int[] a) {
        int N = a.length;
        aux = new int[N];
        for (int sz = 1; sz < N; sz += sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        MergeSort.sortUpDown(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
