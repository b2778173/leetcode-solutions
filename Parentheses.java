import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                char cur = stack.pop();
                if (c != cur || stack.isEmpty()) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }
}
