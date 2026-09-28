package SlidingWindow;

public class Q930_BinarySubArray {

    public static int result(int[] nums,int goal){
        return binarySubArray(nums, goal) - binarySubArray(nums, goal-1);
    }

    public static int binarySubArray(int[] nums, int goal) {

        if (goal < 0) {
        return 0;
    }

        int left = 0, right = 0, sum = 0, count=0;
        
        while(right<nums.length){
            sum = sum+nums[right];

            while (sum>goal) {
                sum-=nums[left];
                left++;
                
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        int goal = 0;
        System.out.println(result(nums, goal));
    }
}
