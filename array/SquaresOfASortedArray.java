package array;

public class SquaresOfASortedArray {
    int[] squaresOfASortedArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int k = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[k] = nums[left] * nums[left];
                k--;
                left++;
            } else {
                result[k] = nums[right] * nums[right];
                k--;
                right--;
            }
        }
        return result;
    }
}
