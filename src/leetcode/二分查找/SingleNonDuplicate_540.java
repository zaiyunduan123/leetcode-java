package leetcode.二分查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class SingleNonDuplicate_540 {
    /**
     * 540. 有序数组中的单一元素
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,1,2,3,3,4,4,8,8]
     * 输出: 2
     * 示例 2:
     * <p>
     * 输入: [3,3,7,7,10,11,11]
     * 输出: 10
     * 注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (m % 2 == 1)
                m--;   // 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
