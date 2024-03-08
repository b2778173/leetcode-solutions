package stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveRedundantParenthesis {
    //    test
    public static void main(String[] args) {
        System.out.println("RemoveRedundantParenthesis test!");
        System.out.println(removeBrackets("1*(2+(3*(4+5)))"));
        System.out.println(removeBrackets("2 + (3 / -5)"));
        System.out.println(removeBrackets("x+(y+z)+(t+(v+w))"));
        System.out.println(removeBrackets("1*(2+3*(4+5))"));
        System.out.println(removeBrackets("(2*(3+4)*5)/6"));
        System.out.println(removeBrackets("(-5)/7"));
        System.out.println(removeBrackets("(-5)*7"));
        System.out.println(removeBrackets("((2*((2+3)-(4*6))+(8+(7*4))))"));
        System.out.println(removeBrackets("((2*((2+3)*5-(4*6))+(8+(7*4))))"));
        System.out.println(removeBrackets("((2*((2+3)+5-(4*6))+(8+(7*4))))"));
    }
    public static String removeBrackets(String Exp) {

        char[] s = Exp.toCharArray();
        int n = Exp.length();

        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int[] lastOps = new int[n];
        int[] nxtOps = new int[n];

        int l = -1;

        // Start Iterating from
        // starting index
        for (int i = 0; i < n; i++) {
            lastOps[i] = l;
            if (s[i] == '*' || s[i] == '+' || s[i] == '-' || s[i] == '/') {
                l = s[i];
            }
        }

        // Start Iterating from
        // last index
        l = -1;

        for (int i = n - 1; i >= 0; i--) {
            nxtOps[i] = l;
            if (s[i] == '*' || s[i] == '+' || s[i] == '-' || s[i] == '/') {
                l = s[i];
            }
        }

        Stack<Integer> st = new Stack<>();
        int[] sign = new int[256]; // operator index mapping array
        int[] mp = new int[256]; // operator is inside current parenthesis mapping array, use to check the operator in the parenthesis.
        Arrays.fill(sign, -1);
        char[] operand = {'*', '+', '-', '/'};

        for (int p = 0; p < n; p++) {
            for (char x : operand) {
                mp[x] = 0; // reset
                if (x == s[p])
                    sign[x] = p; // 紀錄 operand index
            }
            if (s[p] == '(') {
                st.push(p);
            } else if (s[p] == ')') {
                int i = st.pop(); // '(' index
                int j = p; // ')' index

                int nxt = nxtOps[j]; // 下一個operator
                int last = lastOps[i]; // 上一個operator

                // Iterate in operator
                // array
                for (char x : operand) {
                    if (sign[x] >= i) {
                        mp[x] = 1; // 如果 current operand 在 '(' parenthesis 裏面, mp[operator] = 1;
                    }
                }
                int ok = 0;

                if (i > 0 && j + 1 < n && s[i - 1] == '(' && s[j + 1] == ')') { // the outermost parenthesis is
                    // redundant
                    ok = 1;
                }
                if (mp['+'] == 0 && mp['*'] == 0 && mp['-'] == 0 && mp['/'] == 0) { // all operator mp is 0 means the
                    // operator is outside the
                    // parenthesis.
                    ok = 1;
                }
                if (last == -1 && nxt == -1) { // 暫時無碰到任何operator前 all parenthesis are redundant
                    ok = 1;
                }
                // parenthesis contain only one number with -+
                if (mp['-'] == 1 && j - i <= 3) {
                    ok = 1;
                } else if (mp['+'] == 1 && j - i <= 2) {
                    ok = 1;
                }
                if (last == '/' ) { // 除後面的parenthesis always valid
                    //
                } else if (nxt == '/' && (mp['-'] == 1 || mp['+'] == 1)) { // 分子parenthesis 含有+-
                    //
                } else if (last == '*') {
                    if (s[i - 1] == '(' && (nxt == '-' || nxt == '+')) { // last operator is * and next is -,+ ,previous char is (, parenthesis is redundant
                        ok = 1;
                    }
                } else if (last == '-' && (mp['+'] == 1 || mp['-'] == 1)) { // - 後面之parenthesis含有+- , parenthesis is valid
                    //
                } else if (mp['-'] == 0 && mp['+'] == 0) { // -,+ are outside parenthesis , is redundant, /* dont need parenthesis to keep priority.
                    ok = 1;
                } else {
                    if ((last == -1 || last == '+' || last == '-') && (nxt == -1 || nxt == '+' || nxt == '-'))
                        // -, +
                        // 為同一個等級,
                        // 不需要parenthesis
                        ok = 1;

                }
                // If the pair is redundant
                if (ok == 1) {
                    ans[i] = 0;
                    ans[j] = 0;
                }
            }
        }

        // Final string
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (ans[i] > 0) {
                res.append(s[i]);
            }
        }
        return res.toString();
    }
}
