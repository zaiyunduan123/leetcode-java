package leetcode.双指针;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class JudgeSquareSum_633 {
    /**
     * 633. 平方数之和
     题目描述提示帮助提交记录社区讨论阅读解答
     随机一题
     给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。

     示例1:

     输入: 5
     输出: True
     解释: 1 * 1 + 2 * 2 = 5
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j){
            int num = i*i + j*j;
            if(num == c)
                return true;
            if(num < c)
                i++;
            else
                j--;
        }
        return false;
    }
}
