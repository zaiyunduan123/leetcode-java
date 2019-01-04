package 数组;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 上午10:57
 *
 * 按奇偶排序数组
 */
public class SortArrayByParity_905 {

    public static void main(String[] args) {
        SortArrayByParity_905 s = new SortArrayByParity_905();
        int[] ints = s.sortArrayByParity(new int[]{3, 1, 2, 4});
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = 0; j < A.length; j++) {
            if (A[j] % 2 == 0) {
                int temp = A[i];
                A[i++] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }


}
