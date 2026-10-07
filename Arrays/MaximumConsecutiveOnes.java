package Arrays;


public class MaximumConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] arr){

        if(arr==null || arr.length == 0) return -1;

        int max = 0;
        int current = 0;

       for(int num:arr){
        if(num == 1){
            current++;
            max = Math.max(max, current);
        }else{
            current = 0;
        }
       }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int[] arr1 = {1,0,1,1,0,1};
        System.out.println(maxConsecutiveOnes(arr));
        System.out.println(maxConsecutiveOnes(arr1));
    }
}
