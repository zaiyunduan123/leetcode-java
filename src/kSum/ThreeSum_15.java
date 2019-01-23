package kSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/14 下午8:41
 * 三数之和
 * <p>
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class ThreeSum_15 {

    List<List<Integer>> ret = new ArrayList<List<Integer>>();

    /**
     * 这题相比2SUM多了几个难点：
     *
     * 1. 数组里允许重复的数
     * 2. 结果要按升序排列
     * 3. 结果中不能出现重复的结
     *
     * 思路：排序 + 左右夹逼，注意过滤重复项
     */
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return ret;
        }
        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])//过滤重复项
                continue;
            find(nums, i + 1, len - 1, nums[i]);

        }
        return ret;

    }

    private void find(int[] nums, int begin, int end, int target) {
        int l = begin, r = end;
        //左右夹逼的方法
        while (l < r) {
            if (nums[l] + nums[r] + target == 0) {
                List<Integer> ans = new ArrayList<Integer>();
                ans.add(target);
                ans.add(nums[l]);
                ans.add(nums[r]);
                ret.add(ans);
                while (l < r && nums[l] == nums[l + 1]) l++;//过滤重复项
                while (l < r && nums[r] == nums[r - 1]) r--;//过滤重复项
                l++;
                r--;
            } else if (nums[l] + nums[r] + target < 0) {
                l++;
            } else {
                r--;
            }
        }

    }
}
