package leetcode.easy;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/29 下午9:18
 */
public class CountPrimes_204 {

    public static void main(String[] args) {
        CountPrimes_204 c = new CountPrimes_204();
        System.out.println(c.countPrimes(10));
    }

    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}
