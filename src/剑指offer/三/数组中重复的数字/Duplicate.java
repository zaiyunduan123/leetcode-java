package 剑指offer.三.数组中重复的数字;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class Duplicate {

    /**
     * 3. 数组中重复的数字
     * NowCoder
     * <p>
     * 题目描述
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。例如，如果输入长度为 7 的数组 {2, 3, 1, 0, 2, 5}，那么对应的输出是第一个重复的数字 2。
     * <p>
     * 要求复杂度为 O(N) + O(1)，也就是时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。牛客网讨论区这一题的首票答案使用 nums[i] + length 来将元素标记，这么做会有加法溢出问题。
     *
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        int[] arr = new int[length];
        int n = 0;
        for (int i = 0; i < length; i++) {
            arr[numbers[i]]++;
            if (arr[numbers[i]] > 1) {
                duplication[n] = numbers[i];
                n++;
                break;
            }
        }
        return n == 0 ? false : true;
    }
}
