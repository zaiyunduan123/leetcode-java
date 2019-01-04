package leetcode.尺取法;

/**
 * Created by jiangyunxiong on 2018/5/3.
 *
 * 长度最小的子数组
 *
 * 题目要求在一个正数数组中寻找一个连续的子数组，使得这个子数组的和值大于等于给定的s，并要求这个子数组的长度最小
 */
public class MinSubArrayLen_209 {


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
