package 栈;

import java.util.Stack;

/**
 * @Author jiangyunxiong
 * @Date 2019/1/3 下午11:04
 * <p>
 * 问题：解析linux路径，有”.”表示不变和”..”表示回上层。
 */
public class SimplifyPath_71 {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/+");
        for (String s : paths) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = "/" + stack.pop() + res;
        }
        if (res.length() == 0) return "/";
        return res;
    }
}
