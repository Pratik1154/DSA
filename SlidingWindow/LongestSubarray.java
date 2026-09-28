package SlidingWindow;

public class LongestSubarray {

    public static int longestSubArraySum(int[] arr, int k) {

        int low = 0, high = 0, sum = 0, maxLen = 0;

        while (high < arr.length) {
            sum += arr[high];

            if (sum > k) {
                sum -= arr[low];
                low++;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, high-low + 1);
            }
            high++; 
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 10, 10 };
        System.out.println(longestSubArraySum(arr, 14));
    }
}
