import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    while (nums[j] == nums[j + 1])
                        j++;
                    j++;
                } else if (sum > 0) {
                    while (nums[k] == nums[k - 1])
                        k--;
                    k--;
                } else {
                    List<Integer> subArray = new ArrayList<Integer>();
                    subArray.add(nums[i]);
                    subArray.add(nums[j]);
                    subArray.add(nums[k]);
                    ans.add(subArray);
                    while (nums[j] == nums[j + 1])
                        j++;
                    while (nums[k] == nums[k - 1])
                        k--;
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
