package 数组;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午4:31
 *
 * 按奇偶排序数组 II
 */
public class SortArrayByParityII_922 {
    public static void main(String[] args) {
        SortArrayByParityII_922 s = new SortArrayByParityII_922();
        int[] ints = s.sortArrayByParityII(new int[]{2, 4, 5, 6, 3, 1, 7, 8});
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while (i < n && j < n) {
            while (i < n && A[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && A[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(A, i, j);
            }
        }
        return A;
    }


    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }


}
