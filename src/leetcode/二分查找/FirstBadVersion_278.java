package leetcode.二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 下午3:01
 */
public class FirstBadVersion_278 {

    public int firstBadVersion(int n) {
       int start = 1, end = n;
       while (start < end){
           int mid = start + (end - start)/2;
           if (!isBadVersion(mid))
               start = mid + 1;
           else
               end = mid;
       }
       return start;
    }

    boolean isBadVersion(int version){
        return false;
    }
}
