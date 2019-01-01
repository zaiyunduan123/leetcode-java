package leetcode.动态规划;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/1 上午1:40
 * <p>
 * 最长上升子序列（DP + 二分）
 * <p>
 * b[i]=max(b[i],b[j]+1);
 */
public class LongestIncreasingSubsequence_300 {


    public int lengthOfLIS(int[] nums) {
        int i, j, max, n = nums.length;
        int[] b = new int[100000];
        b[0] = 1;//以a[0]结尾的最长递增子序列长度为1
        for (i = 1; i < n; i++) {
            b[i] = 1;//b[i]最小值为1
            for (j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    b[i] = Math.max(b[i], b[j] + 1);
                }
            }
        }
        for (max = i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }
}
