package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/22 上午11:15
 */
public class FlipAndInvertImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int[] row : A) {
            for (int i = 0; i * 2 < n; i++) {
              if(row[i]==row[n-i-1]){
                  row[i]=row[n-i-1]^=1;
              }
            }
        }
        return A;
    }
}
