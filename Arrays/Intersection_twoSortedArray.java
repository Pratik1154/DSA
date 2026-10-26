package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Intersection_twoSortedArray {
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }
        Set<Integer> res = new HashSet<>();
        for(int num:nums2){
            if(s.contains(num)) res.add(num);
        }

        int[] ans = new int[res.size()];
        int i = 0;
        for(int num:res){
            ans[i++]=num;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,5};
        int[] nums2 = {1,2,7};

        int[] nums = intersectionArray(nums1, nums2);
        for(int num:nums) System.out.println(num);

    }
}
