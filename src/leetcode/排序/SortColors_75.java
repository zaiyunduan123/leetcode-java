package leetcode.排序;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/20 下午9:10
 * <p>
 * 按颜色进行排序
 * <p>
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */

/**
 *
 * 中心思想：三向切分快速排序
 *
 * 用两个指针left, right来分割数组。left用来记录第一个1， right用来记录从右数起第一个非2数。
 * left起始为0，right起始为n-1. 遍历时，
 * 1、遇到0， 就将nums[left]和nums[i]换一换，将0换到左边去，由于现在nums[left]是0了，left++, i++;
 * 2、遇到1，left和right都不动，i++;
 * 3、遇到2，和Nums[right]换一换把2换到右边去，现在Nums[right]上是2所以right--, nums[i]上是0或者1，所以i不动，要继续检查是0还是1.
 */
public class SortColors_75 {

    public void sortColors(int[] nums) {

        if (nums.length == 0) {
            return;
        }

        int left = 0, right = nums.length - 1, i = 0;

        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, left, i);
                i++;
                left++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, right, i);
                right--;
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
