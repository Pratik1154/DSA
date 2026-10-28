package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LL_2149_RearrangeBYSign {
    public static int[] rearrangeArray(int[] nums) {
        
        int[] res = new int[nums.length];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(Integer num:nums){
            if(num<0) neg.add(num);
            if(num>0) pos.add(num);
        }

        int n = nums.length;
        int idx = 0;
        int i = 0,j = 0;
        while(idx<n){
            res[idx++] = pos.get(i);
            i++;
            res[idx++] = neg.get(j);
            j++;
        }
        return res;


        // without extra space solution 
        //  int n = nums.length;
        // int[] res = new int[n];

        // int pos = 0;
        // int neg = 1;

        // for (int num : nums) {
        //     if (num > 0) {
        //         res[pos] = num;
        //         pos += 2;
        //     } else {
        //         res[neg] = num;
        //         neg += 2;
        //     }
        // }

        // return res;

    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] res = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
