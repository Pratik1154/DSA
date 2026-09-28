package Two_Pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array
 * of the squares of each number sorted in non-decreasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * Example 2:
 * 
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 * 
 */

public class Q977_Square_of_Sorted_array {

    public static int[] sortedSquare(int[] arr) {


        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) {
                neg.add(num * num);
            } else {
                pos.add(num * num);
            }
        }

        Collections.reverse(neg);

        if (neg.size() == 0) {
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }
        if (pos.size() == 0) {
            // Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        int left = 0, right = 0, id = 0;
        int m = neg.size();
        int n = pos.size();
        int[] res = new int[n + m];

        while (left < m && right < n) {
            if (neg.get(left) <= pos.get(right)) {
                res[id] = neg.get(left);
                id++;
                left++;
            } else {
                res[id] = pos.get(right);
                id++;
                right++;
            }
        }
        while (right < n) {
            res[id] = pos.get(right);
            id++;
            right++;
        }
        while (left < m) {
            res[id] = neg.get(right);
            id++;
            left++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };

        int[] square = sortedSquare(arr);
        for (int x : square) {
            System.out.print(x + ",");
        }
    }
}
