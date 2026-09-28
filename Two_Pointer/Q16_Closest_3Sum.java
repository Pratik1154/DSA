package Two_Pointer;

import java.util.Arrays;

/*
Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2). */

public class Q16_Closest_3Sum {

    public static int closestSum(int[] arr, int target) {

        Arrays.sort(arr);
        // cause the sorted arrray the sum od the first 3 difit is the closet id all are positive major 
        int closestSum = arr[0]+arr[1]+arr[2];
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];
                int abs = Math.abs(target - sum);

                if (abs < minAbs) {
                    minAbs = abs;
                    closestSum = sum;
                }
                if (sum == target) {
                    return sum;
                }
                if (sum < target) {
                    left++;
                } else{
                    right--;
                }

            }

        }
        return closestSum;
    }
    public static void main(String[] args) {

        int[] arr = {-1,2,1,-4};
        int target = 1;

        System.out.println(closestSum(arr, target));
    }

}
