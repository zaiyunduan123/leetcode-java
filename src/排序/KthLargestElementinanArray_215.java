package 排序;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/6 下午7:06
 *
 * 数组中的第K个最大元素
 */
public class KthLargestElementinanArray_215 {

    public int findKthLargest(int[] nums, int k) {
        k = nums.length -k;
        int lo = 0;
        int hi =nums.length-1;
        while(lo<hi){
            final int j = partition(nums, lo, hi);
            if(j<k){
                lo=j+1;
            }else if (j>k){
                hi=j-1;
            }else{
                break;
            }
        }
        return nums[k];
    }

    public int partition(int[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        while(true) {
            while(i < hi && less(a[++i], a[lo]));
            while(j > lo && less(a[lo], a[--j]));
            if(i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private boolean less(int v, int w) {
        return v < w;
    }
}
