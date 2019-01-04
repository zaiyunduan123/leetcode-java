package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/26 下午7:55
 *
 * 搜索插入位置
 */
public class SearchInsertPosition_35 {


    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
