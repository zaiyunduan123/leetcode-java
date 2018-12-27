package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/25 下午9:49
 */
public class NumArray_303 {

    private int[] nums;

    public NumArray_303(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return nums[j];
        }
        return nums[j] - nums[i - 1];
    }

}
