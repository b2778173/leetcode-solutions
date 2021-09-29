import java.util.*;

public class Intersect {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int n = nums1[i];
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            int n2 = nums2[i];
            int count = map.getOrDefault(n2, 0);
            if (count > 0) {
                ans.add(n2);
                count--;
                if (count > 0) {
                    map.put(n2, count);
                } else {
                    map.remove(n2);
                }
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
