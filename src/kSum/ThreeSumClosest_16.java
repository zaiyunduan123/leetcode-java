package kSum;

import java.util.Arrays;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/14 下午10:58
 * 最接近的三数之和
 *
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class ThreeSumClosest_16 {

    /**
     * 思路：
     * 1、先排序，因为会使用双指针
     * 2、当确定好了第一个数字后，就在剩下的num里找两数之和，从而简化为two sum问题，通过sum-target得到diff，
     * 3、如果diff比closest小，更新closest
     */
    public int threeSumClosest(int[] num, int target) {
        if(num == null || num.length <= 2) return Integer.MIN_VALUE;

        Arrays.sort(num);
        int closest = num[0] + num[1] + num[2] - target;
        for(int i = 0;i<num.length-2;i++){
            int cur = twoSum(num, target-num[i], i+1);
            if(Math.abs(cur) < Math.abs(closest))
                closest = cur;
        }
        return target + closest;
    }

    private int twoSum(int[] num, int target, int start){
        int closest = num[start] + num[start+1] -target;
        int l = start;
        int r = num.length -1;
        while(l<r){
            if(num[l]+num[r] == target)//总和等于target，那么差值就等于0
                return 0;
            int diff = num[l] + num[r] -target;
            if(Math.abs(diff) < Math.abs(closest))//如果diff比closest小，更新closest
                closest = diff;
            if(num[l] + num[r] > target){//说明总和比target大，右指针左移获取更小的总和
                r--;
            }else{//说明总和比target小，左指针右移获取更大的总和
                l++;
            }
        }
        return closest;
    }
}
