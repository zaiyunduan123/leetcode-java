package 数组;

/**
 * @Author jiangyunxiong
 * @Date 2019/4/5 9:45 AM
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] arr = new int[size + 1];
        arr[0] = 1;
        return arr;
    }

}
