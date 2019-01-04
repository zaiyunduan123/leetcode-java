package leetcode.排序.八大排序;

/**
 * @Auther: Jesper
 * @Date: 2019/1/4 14:17
 * @Description: 插入排序
 * <p>
 * 插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左部数组依然有序。
 * 第 j 元素是通过不断向左比较并交换来实现插入过程：当第 j 元素小于第 j - 1 元素，就将它们的位置交换，然后令 j 指针向左移动一个位置，不断进行以上操作。
 */
public class Insertion extends Base {

    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && compare(a[j], a[j - 1]); j--) {
                swap(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 6, 6, 2, 2, 3, 33, 4, 4};
        Insertion.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}