package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersArray {

    public static  List<Integer> leaders(int[] nums) {

        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int rightMost = Integer.MIN_VALUE;

        for(int i = n-1;i>=0;i--){
            if(nums[i]>=rightMost){
                res.add(nums[i]);
                rightMost=nums[i];
            }
        }
        
        // for (int i = 0; i < n; i++) {
        //     boolean isLeader = true;
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[j] >= nums[i]) {
        //             isLeader = false;
        //             break;
        //         }
        //     }
        //     if(isLeader) res.add(nums[i]);
        // }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };
        List<Integer> result = leaders(nums);
        System.out.println(result);
    }
}
