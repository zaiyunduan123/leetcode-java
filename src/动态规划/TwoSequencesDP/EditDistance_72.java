package 动态规划.TwoSequencesDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 下午12:54
 *
 * 问题：给出两个单词word1和word2，计算出将word1 转换为word2的最少操作次数。你总共三种操作方法：插入一个字符、删除一个字符、替换一个字符。
 */
public class EditDistance_72 {

    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        //dp[i][j]表示word1的第i个字符匹配上word2的前j个字符
        int[][] dp = new int[m + 1][n + 1];
        //删除i个字符
        for (int i = 0; i < m + 1; i++) dp[i][0] = i;
        //删除j个字符
        for (int j = 0; j < n + 1; j++) dp[0][j] = j;

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        return dp[m][n];
    }
}
