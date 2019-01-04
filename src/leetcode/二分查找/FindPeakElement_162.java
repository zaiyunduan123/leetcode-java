package leetcode.二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 下午3:30
 *
 * 寻找峰值，峰值元素是指其值大于左右相邻值的元素。
 */
public class FindPeakElement_162 {

    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 1) {
            return nums == null || nums.length == 0 ? -1 : 0;
        }
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid =l+(r-l)/2;
            if (nums[mid]<nums[mid+1]){
                l = mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
}
