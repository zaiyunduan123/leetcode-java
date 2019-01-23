package 双指针;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/23 下午10:07
 */
public class ContainerWithMostWater_11 {
    /**
     * 由于桶的容量由最短的那个木板决定： Vol = min(h[left],h[right]) * (right - left)
     *
     * left和right都向中央移动，每次移动left和Right中间高度较小的（因为反正都是移动一次，宽度肯定缩小1，这时候只能指望高度增加来增加容量，肯定是替换掉高度较小的，才有可能找到更大的容量。）
     *
     * 看新桶子的容量是不是大于Vol_max，直到left和right相交。
     */
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int i = height[l] > height[r] ? r:l;
        int vol, vol_max = height[i]*(r-l);
        while(l<r){
            if(height[l] < height[r]) l++;
            else r--;
            vol = Math.min(height[l], height[r]) * (r-l);
            if(vol>vol_max) vol_max = vol;
        }
        return vol_max;
    }
}
