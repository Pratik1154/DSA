package Two_Pointer;

/**
 * Q167_TwoSum_II
 */
public class Q167_TwoSum_II {

    public static int[] twoSum(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;

        while (st < end) {
            int sum = arr[st] + arr[end];

            if (sum == target) {
                return new int[] { st + 1, end + 1 };
            }

            if (sum > target) {
                end--;
            }
            if (sum < target) {
                st++;
            }
        }

        return new int[]{st+1,end+1};

    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] res = twoSum(arr, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}