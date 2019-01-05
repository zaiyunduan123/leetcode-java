package 动态规划.MatrixDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 上午10:55
 *
 * 不同路径 II
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角,考虑网格中有障碍物,问总共有多少条不同的路径？
 *
 */
public class UniquePathsII_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (m == 0 || n == 0) return 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0)
                dp[i][0] = 1;
            else
                break;
        }
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 0)
                dp[0][j] = 1;
            else
                break;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
