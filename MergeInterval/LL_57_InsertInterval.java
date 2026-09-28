package MergeInterval;

import java.util.ArrayList;

/**
 * LL_57_InsertInterval
 */
public class LL_57_InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length + 1][];
        int[][] merge = new int[res.length][];
            int idx = 0;
            boolean insert = false;
        for (int i = 0; i < intervals.length; i++) {
            
            int start1 = intervals[i][0];
            
            if (insert == false && start1 >= newInterval[0]) {
                res[idx] = newInterval;
                idx++;
                insert = true;
            }
            res[idx] = intervals[i];
            idx++;
        }
        if (!insert) {
            res[idx] = newInterval;
            idx++;
        }


        int start1 = res[0][0];
        int end1 = res[0][1];
        int idxx = 0;

        for (int i = 1; i < res.length; i++) {
            int start2 = res[i][0];
            int end2 = res[i][1];

            if (end1 >= start2) {
                start1 = start1;
                end1 = Math.max(end1, end2);
            } else {
                merge[idxx] = new int[]{start1,end1};
                idxx++;
                start1 = start2;
                end1 = end2;
            }

        }
        return merge;

    }
}