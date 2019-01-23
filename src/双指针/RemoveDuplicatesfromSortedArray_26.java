package 双指针;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/23 下午10:15
 *
 * 删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 */
public class RemoveDuplicatesfromSortedArray_26 {

    /**
     * 思路：用2个指针:
     * 1个指针i从1移动到length
     * 1个指针newlen记录不重复的个数，只有出现不重复的时候它才能+1
     */
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int newlen = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[newlen++] = nums[i];
            }
        }
        return newlen;
    }
}
