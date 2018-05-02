package 剑指offer.五.替换空格;

/**
 * Created by jiangyunxiong on 2018/5/2.
 */
public class ReplaceSpace{
        /**
         * 替换空格
         * 题目描述
         * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
         *
         * @param str
         * @return
         */
        public String replaceSpace(StringBuffer str) {
            String s = str.toString();
            return str.toString().replaceAll(" ", "%20");
        }
}
