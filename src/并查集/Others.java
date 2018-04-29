package 并查集;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jiangyunxiong on 2018/4/28.
 */
public class Others {


    public int countBitDiff(int m) {
        return Integer.bitCount(m);
    }


    /**
     * 540. 有序数组中的单一元素
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 给定一个只包含整数的有序数组，每个元素都会出现两次，唯有一个数只会出现一次，找出这个数。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,1,2,3,3,4,4,8,8]
     * 输出: 2
     * 示例 2:
     * <p>
     * 输入: [3,3,7,7,10,11,11]
     * 输出: 10
     * 注意: 您的方案应该在 O(log n)时间复杂度和 O(1)空间复杂度中运行。
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (m % 2 == 1)
                m--;   // 保证 l/h/m 都在偶数位，使得查找区间大小一直都是奇数
            if (nums[m] == nums[m + 1]) {
                l = m + 2;
            } else {
                r = m;
            }
        }
        return nums[l];
    }

    /**
     * 455. 分发饼干
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
     * <p>
     * 注意：
     * <p>
     * 你可以假设胃口值为正。
     * 一个小朋友最多只能拥有一块饼干。
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,2,3], [1,1]
     * <p>
     * 输出: 1
     * <p>
     * 解释:
     * 你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
     * 虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
     * 所以你应该输出1。
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i])
                i++;
            j++;
        }
        return i;
    }

    /**
     * 判断子序列
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * <p>
     * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
     * <p>
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * <p>
     * 示例 1:
     * s = "abc", t = "ahbgdc"
     * <p>
     * 返回 true.
     * <p>
     * 示例 2:
     * s = "axc", t = "ahbgdc"
     * <p>
     * 返回 false.
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int i = 0, j = 0;
        while (i < ch1.length && j < ch2.length) {
            if (ch1[i] == ch2[j])
                i++;
            j++;
        }
        return i == ch1.length - 1;
    }

    /**
     * 406. 根据身高重建队列
     * 题目描述提示帮助提交记录社区讨论阅读解答
     * 随机一题
     * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
     * <p>
     * 注意：
     * 总人数少于1100人。
     * <p>
     * 示例
     * <p>
     * 输入:
     * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
     * <p>
     * 输出:
     * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
     *
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) return new int[0][0];
        //身高降序、k 值升序
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        int N = people.length;
        //为了在每次插入操作时不影响后续的操作，身高较高的学生应该先做插入操作，否则身高较小的学生原先正确插入第 k 个位置可能会变成第 k+1 个位置。
        List<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int index = people[i][1];
            int[] p = new int[]{people[i][0], people[i][1]};
            tmp.add(index, p);
        }

        int[][] ret = new int[N][2];
        for (int i = 0; i < N; i++) {
            ret[i][0] = tmp.get(i)[0];
            ret[i][1] = tmp.get(i)[1];
        }
        return ret;
    }


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
    public static void main(String[] args) {
        Others o = new Others();
//        int[] g = {1, 2};
//        int[] s = {1,2,3};
        String s = "abc";
        String t = "ahbgdc";
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

        System.out.println(o.reconstructQueue(people));
    }
}
