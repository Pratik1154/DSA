package Arrays;

public class LL_26_Remove_Duplicate {

    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length<2){
            return 0;
        }

        int left = 0;
        int right = 1;
        int count = 1;

        while(right<nums.length){

            if(nums[left]==nums[right]){
                right++;
            }else{
                nums[left+1] = nums[right];
                count++;
                left++;
                right++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    
}
