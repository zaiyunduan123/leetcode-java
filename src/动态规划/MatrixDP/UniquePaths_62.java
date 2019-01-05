package 动态规划.MatrixDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 上午10:09
 * <p>
 * 不同路径(模版)
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角 ,问总共有多少条不同的路径？
 */
public class UniquePaths_62 {

    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 0;
        int[][] dp = new int[m][n];
        //初始化第一行第一列某个位置的来源都只有一种情况
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 要么从上边来，要么从左边来
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
