package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Union_twoSortedArray {
    public static  int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<nums1.length;i++){
            if(i>0 && nums1[i]==nums1[i-1]){
                continue;
            }else{
                list.add(nums1[i]);
            }
        }
        for(int num:nums2){
            if(list.contains(num)){
                continue;
            }else{
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 6, 7, 9, 9};
        int[] arr2 = {1, 5, 7, 8, 8};

        int[] res = unionArray(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
