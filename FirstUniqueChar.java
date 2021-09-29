import java.util.*;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, 2);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
