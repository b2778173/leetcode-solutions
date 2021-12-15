import java.util.*;

public class IsIsomorphicHelper {
    public static boolean isIsomorphicHelper(String s, String t) {
        Map<Character, Character> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (myMap.containsKey(c1)) {
                if (myMap.get(c1) != c2) {
                    return false;
                }
            } else {
                myMap.put(c1, c2);
            }
        }
        return true;
    }
}
