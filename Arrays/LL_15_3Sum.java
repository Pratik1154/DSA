package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LL_15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int L = i + 1;
            int R = nums.length - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));

                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++;
                    }

                } else {
                    R--;

                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }

                }
            }

        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = threeSum(nums);
        res.forEach(System.out::println);
    }
}
