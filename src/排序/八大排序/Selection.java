package 排序.八大排序;

/**
 * @Auther: Jesper
 * @Date: 2019/1/4 14:17
 * @Description: 选择排序
 * <p>
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，
 * 将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。
 */
public class Selection extends Base {

    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if (compare(a[j], a[min]))
                    min = j;
            swap(a, i, min);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        Selection.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
