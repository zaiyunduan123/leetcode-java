package leetcode.动态规划;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class Rob_198 {

    /**
     * 强盗抢劫

     198. House Robber (Easy)

     题目描述：抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。

     定义 dp 数组用来存储最大的抢劫量，其中 dp[i] 表示抢到第 i 个住户时的最大抢劫量。由于不能抢劫邻近住户，因此如果抢劫了第 i 个住户那么只能抢劫 i - 2 和 i - 3 的住户，所以



     O(n) 空间复杂度实现方法：
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int n = nums.length;
        /**
         * 初始化前面三个，因为前面三个是固定
         */
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[0] + nums[2];
        for(int i = 3;i < n;i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]) + nums[i];
        }
        return Math.max(dp[n-1], dp[n-2]);
    }
    public static void main(String[] args) {
        Rob_198 dp = new Rob_198();
        int[] str = {1,2,3,1};
        System.out.println(dp.rob(str));
    }
}
