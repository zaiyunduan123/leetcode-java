package leetcode.排序.八大排序;

/**
 * @Auther: Jesper
 * @Date: 2019/1/4 14:16
 * @Description:  冒泡排序
 * <p>
 * 通过从左到右不断交换相邻逆序的相邻元素，在一轮的交换之后，可以让未排序的元素上浮到最右侧，是的右侧是已排序的。
 * 在一轮交换中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
 */
public class Bubble extends Base {

    public static void sort(int[] a) {
        int N = a.length;
        boolean hasSorted = false;
        for (int i = 0; i < N && !hasSorted; i++) {
            hasSorted = true;
            for (int j = 0; j < N - i - 1; j++) {
                if (compare(a[j + 1], a[j])) {
                    hasSorted = false;
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        Bubble.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}