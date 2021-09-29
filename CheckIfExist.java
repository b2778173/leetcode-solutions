import java.util.Arrays;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i] * 2;
            int left = i + 1;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] > target) {
                    right = mid - 1;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else if (arr[mid] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
