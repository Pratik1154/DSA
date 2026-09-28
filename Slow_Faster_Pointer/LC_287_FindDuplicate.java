package Slow_Faster_Pointer;

/**
 * LC_287_FindDuplicate
 */
public class LC_287_FindDuplicate {

    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if(slow == fast){
                slow = 0;

                while (slow!=fast) {
                     slow = nums[slow];
                     fast = nums[fast];
                }
                return slow;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}