package 二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 下午3:30
 *
 * 寻找峰值，峰值元素是指其值大于左右相邻值的元素。
 */
public class FindPeakElement_162 {

    /**
     * 时间复杂度：O(log2n)
     * 思路：二分查找，如果mid在波峰的递增部分，那么l=mid+1，如果mid在波峰的递减部分，r=mid, 当l=r时，也就是mid在波峰，那么返回
     */
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
