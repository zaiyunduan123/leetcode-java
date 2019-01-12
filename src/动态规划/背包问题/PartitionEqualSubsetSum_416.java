package 动态规划.背包问题;

import java.util.Arrays;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/12 上午11:42
 *
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 */
public class PartitionEqualSubsetSum_416 {

    /**
     * 思路： 典型的01背包问题，在n个物品中选出一定物品，填满sum/2的背包。
     * 若只考虑第i个整数的策略（选或不选）如果我们不选取第i个整数，dp[i][j]=dp[i-1][j]，这意味着如果第一个i-1元素已经到达j，dp[i][j]也会到达j（我们可以忽略nums[i]）。如果我们选择nums[i]。dp
     * [i][j]=dp[i-1][j-nums[i]]，表示j由当前值nums[i]组成，其余由其他以前的数字组成。因此，转换函数是dp[i][j]=dp[i-1][j]dp[i-1][j-nums[i]]
     *
     * 时间和空间复杂度均为O(n*Sum)
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;

        int n = nums.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], false);
        }

        dp[0][0] = true;

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = true;
        }
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    /**
     * 时间复杂度基本已经不能再优化了，但空间复杂度却可以优化到O(Sum)
     */
    public boolean canPartition2(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }

        sum /= 2;

        boolean[] dp = new boolean[sum + 1];
        Arrays.fill(dp, false);

        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = sum; j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];
    }
}
