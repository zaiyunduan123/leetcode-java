package 动态规划.TwoSequencesDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/5 9:52 AM
 *
 * 最大子序和
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int segmentSum = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            segmentSum = Math.max(nums[i], segmentSum + nums[i]);
            res = Math.max(segmentSum, res);
        }
        return res;
    }
}
