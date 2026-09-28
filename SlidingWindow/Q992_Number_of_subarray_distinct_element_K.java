package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
992. Subarrays with K Different Integers
Hard
Topics
premium lock icon
Companies
Hint
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array. */

public class Q992_Number_of_subarray_distinct_element_K {

    public static int subarraysWithKDistinct(int[] nums, int k){
        return atMost(nums, k)-atMost(nums, k-1);
    }

    public static int atMost(int[] nums, int k) {

        int left = 0, right = 0, count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        while (right < nums.length) {

            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while (map.size()>k) {
                map.put(nums[left], map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
           count+=right-left+1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(arr, k));
    }

}
