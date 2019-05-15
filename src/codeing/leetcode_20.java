package codeing;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @ClassName leetcode_20
 * @Description 有效的括号
 * @Author 李怀鹏
 * @Date 2019/5/11 16:52
 * @Version 1.0
 **/
public class leetcode_20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.peek() == '(' && s.charAt(i) != ')') {
                        return false;
                    } else if (stack.peek() == '{' && s.charAt(i) != '}') {
                        return false;
                    } else if (stack.peek() == '[' && s.charAt(i) != ']') {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "{[]}";
        leetcode_20 leetcode_20 = new leetcode_20();
        boolean s1 = leetcode_20.isValid(s);
        System.out.println(s1);
    }
}
