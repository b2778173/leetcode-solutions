import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            if (g[i] <= s[j]) {
                count++;
            } else {
                j++; // 向後尋找更大的餅乾
            }
        }
        return count;
    }
}
