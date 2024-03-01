package array;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (true) {
            int index = partition(nums, left, right);
            // kth largest ’s index = k-1;
            if (index == k - 1) {
                return nums[index];
            } else if (index > k - 1) { // index太大(找成第ｋ＋ｎ大的數), 往左邊的元素找 （找大
                right = index - 1;
            } else {
                left = index + 1; // index太小, 找成第k-n大的數, 往右邊找（找小
            }
        }
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[l];
        int left = l + 1;
        int right = r;
        while (left <= right) {
            if (nums[left] < pivot && nums[right] > pivot) {
                swap(nums, left, right);
                left++;
                right++;
            }
            // skip
            if (nums[left] >= pivot) { // sort desc, 所以 left 需要比povit 大, 右邊需要筆povit 小
                left++;
            }
            // skip
            if (nums[right] <= pivot) {
                right--;
            }
        }
        // 將povit換到right在的位置
        swap(nums, l, right);
        return right; // return povit index
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
