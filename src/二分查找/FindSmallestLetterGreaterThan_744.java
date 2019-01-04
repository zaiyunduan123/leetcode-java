package 二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/24 下午11:56
 *
 * 寻找比目标字母大的最小字母
 */
public class FindSmallestLetterGreaterThan_744 {

    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int num = letters[mid];
            if (num <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left%(letters.length)];
    }
}
