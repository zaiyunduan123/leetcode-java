package 二分查找;

/**
 * @Auther: Jesper
 * @Date: 2019/1/14 15:05
 * @Description: 是在旋转有序数组中搜索的延伸，现在数组中允许出现重复数字
 */
public class SearchinRotatedSortedArrayII_81 {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target == nums[m]) return true;
            //说明从m到r一定是有序的（没有受到rotate的影响）
            if (nums[m] < nums[r]) {
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
                //说明从l到m一定是有序的
            } else if (nums[m] > nums[r]) {
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }else{
                r--;
            }
        }
        return false;
    }
}
