package KadansAlgorithm;

/**
 * LC_1186_MaximumSubArraySum_OneDelete
 */
public class LC_1186_MaximumSubArraySum_OneDelete {

    public static int maxSum(int[] arr) {
        int oneDelete = arr[0];
        int noDelete = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = noDelete;
            noDelete = Math.max(noDelete + arr[i], arr[i]);
            oneDelete = Math.max(prevNoDelete,oneDelete+arr[i]);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 0, 3 };
        System.out.println(maxSum(arr));
    }
}