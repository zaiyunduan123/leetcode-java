package 数组;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 下午6:04
 *
 * 转置矩阵
 */
public class Transpose_867 {
    public int[][] transpose(int[][] A) {
        int M = A.length, N = A[0].length;
        int[][] B = new int[N][M];
        for (int j = 0; j < N; j++)
            for (int i = 0; i < M; i++)
                B[j][i] = A[i][j];
        return B;
    }
}
