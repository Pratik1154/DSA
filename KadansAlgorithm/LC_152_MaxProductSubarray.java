package KadansAlgorithm;

public class LC_152_MaxProductSubarray {
    
      public static int maxSubArrayProd(int[] arr){

        if(arr == null || arr.length==0){
            return 0;
        }
        if(arr.length==1) return arr[0];

       int minEnding = arr[0], maxEnding = arr[0], res = arr[0];

       for(int i = 1;i<arr.length;i++){
            int v1 = arr[i];
            int v2 = minEnding*arr[i];
            int v3 = maxEnding*arr[i];

            minEnding = Math.min(v1,Math.min(v2, v3));
            maxEnding = Math.max(v1,Math.max(v2, v3));

            res = Math.max(res, Math.max(minEnding, maxEnding));
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,-4, 2,-3,-1, 7,-5};
        System.out.println(maxSubArrayProd(arr));

    }
}
