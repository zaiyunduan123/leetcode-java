package 二分查找;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/30 下午7:53
 *
 * 猜数字大小
 */
public class GuessNumberHigherorLower_374 {

    public static void main(String[] args) {
        GuessNumberHigherorLower_374 g = new GuessNumberHigherorLower_374();
        System.out.println(g.guessNumber(10));
    }

    public int guessNumber(int n) {

        int l =1;
        int r =n;
        int m = 0;
        while (l<r){
            m = l+(r-l)/2;
            if (guess(m)==0){
                return m;
            }else if (guess(m)==1){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;

    }
    int guess(int num){
        if (num == 6){
            return 0;
        }else if(num<6){
            return -1;
        }else {
            return 1;
        }
    }
}
