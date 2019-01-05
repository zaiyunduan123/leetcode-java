package 动态规划.SequenceDP;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/5 下午12:37
 *
 * 跳跃游戏
 */
public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max) {return false;}
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }
}
