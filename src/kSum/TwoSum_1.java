package kSum;

import java.util.HashMap;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/14 下午8:14
 *
 * 两数之和
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null && map.get(target - nums[i]) != i) {
                return new int[]{i, map.get(target - nums[i])};

            }
        }
        return null;
    }
}
