package array;

public class MinimumSizeSubarraySum {
    int minimumSizeSubarraySum(int target, int[] nums) {
        int begin = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - begin + 1);
                sum -= nums[begin];
                begin++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
