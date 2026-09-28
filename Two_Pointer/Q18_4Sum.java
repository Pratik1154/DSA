package Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_4Sum {
    public static List<List<Integer>> fourSum(int[] arr, int target){
        
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0;i<n-3;i++){
            // handle the duplicate for the i
            if(i>0 && arr[i]==arr[i-1]) continue;

            for(int j = i+1; j<n-2;j++){
                int left = j+1, right = n-1;
                

                while(left<right){
                    long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum < target){
                        left++;
                    }else if(sum>target){
                        right--;
                    }else{
                        ans.add(List.of(arr[i], arr[j], arr[left], arr[right]));
                        left++;
                        right--;
                        while (left<right && arr[left]==arr[left-1]) left++;
                    }
                }
                while (j<n && arr[j]==arr[j-1]) j++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> nums = fourSum(arr, target);
        for(List l:nums){
            System.out.println(l);
        }
    }
}
