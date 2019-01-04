package 数组;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午1:08
 *
 * 如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
 */
public class ToeplitzMatrix_766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 1; i != m; i++) {
            for (int j = 1; j != n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
