import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Object[]> stack = new Stack<>();
        StringBuilder res = new StringBuilder(); // string outside '[]'
        int multi = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(new Object[] { multi, res.toString() });
                multi = 0;
                res.setLength(0);

            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                Object[] cur = stack.pop();
                int curMulti = (int) cur[0];
                StringBuilder curRes = new StringBuilder((String) cur[1]);
                for (int i = 0; i < curMulti; i++) {
                    tmp.append(res);
                }
                res = curRes.append(tmp);
            } else if (c >= '0' && c <= '9') {
                int digit = (c - '0');
                multi = multi * 10 + digit;
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
