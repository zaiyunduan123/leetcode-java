package leetcode.深度优先搜索;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/1 下午5:49
 *
 * 深度优先搜索的基本框架
 */
public class Permutations_46 {

    public static void main(String[] args) {
        Permutations_46 p = new Permutations_46();
        int[] a = {1, 2, 3};
        System.out.println(p.permute(a));
    }

    public static List<List<Integer>> res = new ArrayList<>();

    //暂存小答案
    public static int[] path = new int[100];

    //标记用过
    public static boolean[] v = new boolean[100];

    /**
     * 套路，输入：一般有个指针，代表搜到哪了，还有题目给的数据
     *
     * @param idx
     * @param nums
     */
    public static void robot(int idx, int[] nums) {
        //第一行一定是边界值判断，非法直接return
        if (idx >= nums.length) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                tmp.add(nums[path[i]]);

            }
            res.add(tmp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!v[i]) {
                path[idx] = i;
                v[i] = true;
                robot(idx + 1, nums);
                v[i] = false;
            }
        }


    }


    public List<List<Integer>> permute(int[] nums) {
        res.clear();
        robot(0, nums);
        return res;
    }

}
