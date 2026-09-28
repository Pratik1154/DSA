package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * printing All_Subarray OfArray
 */
public class All_SubarrayOfArray {

    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};

        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.println(
                    Arrays.toString(Arrays.copyOfRange(arr, i,j))
                );
            }
        }
    }

}