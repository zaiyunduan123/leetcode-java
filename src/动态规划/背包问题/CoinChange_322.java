package 动态规划.背包问题;

import java.util.Arrays;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/12 下午6:35
 * <p>
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
 * 如果没有任何一种硬币组合能组成总金额，返回 -1。
 */
public class CoinChange_322 {
    /**
     * 思路：完全背包问题，你可以认为每种硬币的数量是无限的
     * 采用动态规划维护一个二维数组dp，dp[i][j]表示从第一个元素到第i个元素累计总金额为j时的最少硬币数量，递推公式为：
     * dp[i][j] = min(dp[i - 1][j], dp[i][j - coins[i-1]]+1);
     */
    public int coinChange(int[] coins, int amount) {


        if (amount < 0 || coins.length == 0) {
            return -1;
        }

        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j < amount + 1; j++) {
            dp[0][j] = amount + 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (j >= coins[i - 1]) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - coins[i - 1]] + 1);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] == (amount + 1) ? -1 : dp[n][amount];

    }

    /**
     *  空间复杂度降为一维，递推公式为：
     *  dp[i] = min(dp[i], dp[i - coins[j]] + 1);
     */
    public int coinChange2(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount <= 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int j = 0; j < coins.length; j++)
            for (int i = coins[j]; i <= amount; i++)
                dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
