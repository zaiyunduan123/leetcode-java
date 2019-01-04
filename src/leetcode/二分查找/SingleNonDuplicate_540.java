package leetcode.二分查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 *
 * 有序数组中的单一元素
 *
 * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数
 */
public class SingleNonDuplicate_540 {
   int singleNonDuplicate(int[] nums) {
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
