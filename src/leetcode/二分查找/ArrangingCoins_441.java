package leetcode.二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 上午8:38
 */
public class ArrangingCoins_441 {

    public static void main(String[] args) {
        ArrangingCoins_441 a = new ArrangingCoins_441();
        System.out.println(a.arrangeCoins(5));
    }

    public int arrangeCoins(int n) {
        int i=1;
        if (n<=1){
            return n;
        }
        int res = n;
        while(true){

            res = res - i;
            i++;
            if (res < i){
                return i;
            }
        }
    }
}
