package KadansAlgorithm;

public class LC_53_MaximumSubArraySum {

    public static int maxSubArraySum(int[] arr){

        if(arr == null || arr.length==0){
            return 0;
        }

        int maxSum = arr[0],bestEnding = arr[0];
        for(int i = 1;i<arr.length;i++){
            int v1 = bestEnding+arr[i];
            int v2 = arr[i];
            bestEnding=Math.max(v1, v2);
            
            
            maxSum=Math.max(maxSum, bestEnding);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2};
        System.out.println(maxSubArraySum(arr));

    }
}
