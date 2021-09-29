import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Long, Long> b = new HashMap<>();
        long size = t + 1L;
        for (int i = 0; i < nums.length; i++) {
            long cur = (long) nums[i];
            long index = getIndex(cur, size);
            if (b.containsKey(index))
                return true;
            // adject bucket
            long a = index + 1;
            long a2 = index - 1;
            if (b.containsKey(a) && b.get(a) - cur <= t)
                return true;
            if (b.containsKey(a2) && cur - b.get(a2) <= t)
                return true;
            b.put(index, cur);
            if (i >= k)
                b.remove(nums[i - k] * 1L);
        }
        return false;
    }

    private long getIndex(long cur, long size) {
        return cur >= 0 ? cur / size : ((cur + 1) / size) - 1;
    }
}
