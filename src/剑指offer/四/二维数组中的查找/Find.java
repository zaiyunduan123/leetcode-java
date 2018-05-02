package 剑指offer.四.二维数组中的查找;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class Find {

    /**
     * 二维数组中的查找
     * NowCoder
     * <p>
     * 题目描述
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int length_x = array.length;
        int length_y = array[0].length;
        int i = 0, j = length_y - 1;
        while (i < length_x && j >= 0) {
            if (target == array[i][j])
                return true;
            if (target > array[i][j])
                i++;
            else
                j--;
        }
        return false;
    }
}
