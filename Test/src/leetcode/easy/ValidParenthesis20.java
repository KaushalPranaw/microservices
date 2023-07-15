package leetcode.easy;

import java.util.Stack;

public class ValidParenthesis20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(check(s));

    }

    private static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char last = stack.peek();
                    if ((c == ']' && last == '[') || (c == '}' && last == '{') || (c == ')' && last == '(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
