package string;

public class ReverseStrII {
    public static String reverseStrII(String s, int k) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, c.length - 1); // 剩下數目不夠k
            while (start < end) {
                char tmp = c[start];
                c[start] = c[end];
                c[end] = tmp;
                start++;
                end--;
            }
        }
        return new String(c);
    }
}
