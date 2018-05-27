package 八大排序;

/**
 * Created by jiangyunxiong on 2018/5/27.
 */

/**
 * 希尔排序
 * <p>
 * 对于大规模的数组，插入排序很慢，因为它只能交换相邻的元素，每次只能将逆序数量减少 1。
 * 希尔排序的出现就是为了改进插入排序的这种局限性，它通过交换不相邻的元素，每次可以将逆序数量减少大于 1。
 * 希尔排序使用插入排序对间隔 h 的序列进行排序。通过不断减小 h，最后令 h=1，就可以使得整个数组是有序的。
 */
public class Shell extends Base {

    public static void sort(int[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++)
                for (int j = i; j >= h && compare(a[j], a[j - h]); j -= h)
                    swap(a, j, j - h);
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        Shell.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
