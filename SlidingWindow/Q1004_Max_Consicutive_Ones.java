package SlidingWindow;

/**
 * Max_Consicutive_Ones
 */
public class Q1004_Max_Consicutive_Ones {

    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, maxLen = 0, zero = 0;

        while(right<nums.length){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
                int len = right - left + 1;
                maxLen = Math.max(len, maxLen);
            right++;
        } 
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(arr, k));
    }
}