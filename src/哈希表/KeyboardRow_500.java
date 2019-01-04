package 哈希表;


import java.util.stream.Stream;

/**
 * @Author jiangyunxiong
 * @Date 2018/12/23 下午12:36
 *
 * 键盘行
 */
public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}
