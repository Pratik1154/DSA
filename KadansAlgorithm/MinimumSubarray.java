package KadansAlgorithm;

/**
 * MinimumSubarray
 */
public class MinimumSubarray {

     public static int minSubArraySum(int[] arr){

        if(arr == null || arr.length==0){
            return 0;
        }

        int minSum = arr[0],bestEnding = arr[0];
        for(int i = 1;i<arr.length;i++){
            int v1 = bestEnding+arr[i];
            int v2 = arr[i];
            bestEnding=Math.min(v1, v2);
            
            
            minSum=Math.min(minSum, bestEnding);
        }
        return minSum;
    }
    public static void main(String[] args) {
        int[] arr = {3,-4, 2,-3,-1, 7,-5};
        System.out.println(minSubArraySum(arr));

    }
}