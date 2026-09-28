package MergeInterval;

import java.util.ArrayList;

public class Merging_Intervals {
    public static void main(String[] args) {
        int[][] a = {{1,3}, {2,6}, {8,10}, {15,16}};

        int start1 = a[0][0];
        int end1 = a[0][1];

       ArrayList<int[]> result = new ArrayList<>();

        for(int i = 1; i<a.length;i++){
            int start2 = a[i][0];
            int end2 = a[i][1];

            if(end1 >= start2){
                start1=start1;
                end1 = Math.max(end1, end2);
                continue;
            }else{
                result.add(new int[]{start1,end1});

                start1 = start2;
                end1 = end2;
            }
           
        }
         result.add(new int[]{start1,end1});
        for(int[] arr:result){
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i]+",");
            }
            System.out.println();
        }
    }
}   
