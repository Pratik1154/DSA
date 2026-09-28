package MergeInterval;

/**
 * LL_986_IntervalLinkIntersection
 */

import java.util.ArrayList;

public class LL_986_IntervalLinkIntersection {

    public static ArrayList intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start1 = firstList[i][0];
            int end1 = firstList[i][1];

            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

            // Find intersection
            int start = Math.max(start1, start2);
            int end = Math.min(end1, end2);

            if (start <= end) {
                res.add(new int[] { start, end });
            }

            // Move the interval that ends first
            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] firstList = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        int[][] secondList = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        ArrayList<int[]> res = intervalIntersection(firstList, secondList);

        for (int[] arr : res) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.println();
        }
    }
}