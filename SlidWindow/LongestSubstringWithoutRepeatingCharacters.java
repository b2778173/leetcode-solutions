package SlidWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    int LongestSubstringWithoutRepeatingCharacters(String s) {
        int slow = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int fast = 0; fast < s.length(); fast++) {
            Character c = s.charAt(fast);
            if (map.containsKey(c)) {
                // meet repeating chatacter , slow index move to next but dont go back(ex: "abba")
                slow = Math.max(slow, map.get(c) + 1);
            }
            map.put(c, fast); // save character and index
            ans = Math.max(ans, fast - slow + 1); // fast - 1 - (slow - 1) + 1= fast - slow + 1
        }
        return ans;
    }
}
