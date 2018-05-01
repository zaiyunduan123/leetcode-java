package leetcode;

import java.util.Arrays;

/**
 * Created by jiangyunxiong on 2018/4/30.
 */
public class DP {

    /**
     * 爬楼梯

     70. Climbing Stairs (Easy)

     题目描述：有 N 阶楼梯，每次可以上一阶或者两阶，求有多少种上楼梯的方法。

     定义一个数组 dp 存储上楼梯的方法数（为了方便讨论，数组下标从 1 开始），dp[i] 表示走到第 i 个楼梯的方法数目。第 i 个楼梯可以从第 i-1 和 i-2 个楼梯再走一步到达，走到第 i 个楼梯的方法数为走到第 i-1 和第 i-2 个楼梯的方法数之和。

     dp[N] 即为所求。

     考虑到 dp[i] 只与 dp[i - 1] 和 dp[i - 2] 有关，因此可以只用两个变量来存储 dp[i - 1] 和 dp[i - 2]，使得原来的 O(N) 空间复杂度优化为 O(1) 复杂度。
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        int p = 1, q = 2;
        for(int i = 2; i < n; i++){
            int cur = p + q;
            p = q;
            q = cur;
        }
        return q;
    }


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
        DP dp = new DP();
//        System.out.println(dp.climbStairs(4));
        int[] str = {1,2,3,1};
        System.out.println(dp.rob(str));
    }
}
