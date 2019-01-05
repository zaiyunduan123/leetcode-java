package 动态规划.GameDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 下午6:01
 * <p>
 * 预测赢家
 *
 * 与877题.石子游戏 相同
 */
public class PredicttheWinner_486 {

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        //dp[i][j]保存第一个动作玩家从i到j得到的分数比第二个玩家多多少
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            dp[i][i] = nums[i];
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                //每个玩家可以从数组的左端或右端选择一个数字c
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;

    }
}
