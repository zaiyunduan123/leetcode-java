package 动态规划.TwoSequencesDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 下午1:00
 * <p>
 * 给出两个字符串，找到最长公共子序列(LCS)，返回LCS的长度。
 */
public class LongestCommonSubsequence_77 {

    public int longestCommonSubsequence(String A, String B) {
        int m = A.length();
        int n = B.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp[m][n];
    }
}
