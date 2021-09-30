import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        nums = Arrays.stream(nums).boxed().sorted((a, b) -> Math.abs(b) - Math.abs(a)).mapToInt(n -> n.intValue())
                .toArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k > 0 && k % 2 == 1) { // nums全跑完, k 依然還有且k為奇數, 偶數會取兩次負數等於沒變
            nums[nums.length - 1] = -nums[nums.length - 1]; // 取最小
        }
        return Arrays.stream(nums).sum();
    }

}
