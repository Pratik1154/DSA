package MergeInterval;

import java.util.Arrays;

/**
 * Overlapping_Interval
 */
public class Overlapping_Interval {

    static boolean isIntersect(int[][] arr) {

         Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = arr[0][0];
        int end1 = arr[0][1];
        
        for( int i = 1; i < arr.length; i++){
             int start2 = arr[i][0];
             int end2 = arr[i][1];
             
             if(end1>=start2){
                 return true;
             }
             start1 = start2;
             end1 = Math.max(end1,end2);
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {5,7}, {2,4}, {6,8}};
        System.out.println(isIntersect(arr));
    }
}