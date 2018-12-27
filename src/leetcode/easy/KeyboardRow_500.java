package leetcode.easy;


import java.util.stream.Stream;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午12:36
 */
public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}
