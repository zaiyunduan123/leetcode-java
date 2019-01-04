package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午11:36
 *
 * 二分查找
 */
public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int num = nums[mid];
            if (num > target) {
                right = mid - 1;
            } else if (num == target) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
