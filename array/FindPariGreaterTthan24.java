package array;

import java.util.Arrays;

public class FindPariGreaterTthan24 {
    public static int solution(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        int count = 0;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum < k) {
                l++;
            }
            if (sum >= k) {
                count++;
                l++;
                r--;
            }
        }
        return count;
    }
}
