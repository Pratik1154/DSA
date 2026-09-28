package SlidingWindow;

public class Q1423_MaximumCardScore {
    
    public static int maxScore(int[] arr, int k){
        
        int leftSum = 0, rightSum = 0, maxSum = 0;
        
        // first foour element
        for(int i = 0;i<=k-1;i++){
            leftSum = leftSum +arr[i];   
        }

        maxSum = leftSum;

        int right = arr.length-1;
        for(int i = k-1; i>=0; i--){
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[right];
            right--;
        }
        maxSum = Math.max(maxSum, leftSum+rightSum);

        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;

        System.out.println(maxScore(arr, k));

    }
}
