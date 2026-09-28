package Preffix_Sum;

import java.util.Arrays;

public class PrefixSum_Of_Elements_Array {
    public static void main(String[] args) {
        int[] arr = {2,7,8,10,15};
        int[] prefix = new int[arr.length];

        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        
    }
}
