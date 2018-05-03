package leetcode.尺取法;

/**
 * Created by jiangyunxiong on 2018/5/3.
 */
public class MinSubArrayLen_209 {
    /**
     * Leetcode209. Minimum Size Subarray Sum：
     * <p>
     * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
     * <p>
     * For example, given the array [2,3,1,2,4,3] and s = 7,
     * the subarray [4,3] has the minimal length under the problem constraint.
     * <p>
     * 题目要求在一个正数数组中寻找一个连续的子数组，使得这个子数组的和值大于等于给定的s，并要求这个子数组的长度最小。
     * <p>
     * 再来看一下这个题的O(n)解法:
     */

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length, l = 0, r = 0, sum = 0, mlen = n + 1;
        while (true) {
            while (r < n && sum < s) {
                sum += nums[r];
                r++;
            }
            if (sum < s)
                break;
            mlen = Math.min(mlen, r - 1);
            sum -= nums[l];
            l++;
        }
        mlen = mlen == n + 1 ? 0 : mlen;
        return mlen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int s = 7;
        MinSubArrayLen_209 m = new MinSubArrayLen_209();
        System.out.println(m.minSubArrayLen(s, arr));
    }
}
