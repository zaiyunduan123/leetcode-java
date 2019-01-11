package 二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午11:36
 *
 * 典型的二分查找
 * 时间复杂度：O(log2n)
 */
public class BinarySearch_704 {

    /**
     * 我们做二分查找类型的题时，会发现有时候没有等号while(l<r)，有时候有等号while(l<=r)
     *
     * 两种你使用哪种都可以，区别是
     * 1、当使用 while(l<r), 那么应该是 r=mid
     * 2、当使用 while(l<=r), 那么应该是 r=mid-1
     * 使用不当会陷入死循环
     */
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
