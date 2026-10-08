package Arrays;

import java.util.Arrays;

public class LeftRotate_byOne {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7 };
        int n = 3;
    for(int k = 0;k<=n;k++){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1]=temp;
    }

        System.out.println(Arrays.toString(arr));
    }
}
