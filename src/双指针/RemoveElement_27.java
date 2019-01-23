package 双指针;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/23 下午10:20
 *
 * 移除元素
 *
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 */
public class RemoveElement_27 {
    /**
     * 两个指针l和r，分别从前后向中间扫描，当两个指针相遇则结束。
     * 如果l < r：
     * 移动l，如果遇到了nums[l] == val的，暂停
     * 移动r，如果遇到了nums[r]!=val的，把值复制给nums[l]（把数组中等于val的值都移到数组后面）
     */
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length-1;
        while(l<=r){
            if(nums[l] == val && nums[r] != val){
                nums[l] = nums[r];
                nums[r] = val;
            }
            if(nums[l]!=val) l++;
            if(nums[r]==val) r--;
        }
        return r+1;
    }
}
