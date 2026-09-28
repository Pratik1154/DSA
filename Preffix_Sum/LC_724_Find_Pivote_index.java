package Preffix_Sum;

/**
 * LC_724_Find_Pivote_index
 */
public class LC_724_Find_Pivote_index {
 public static void main(String[] args) {

        int[] arr = { 1, 7, 3, 6, 5, 6};

        int sum = 0;

        // Calculate total sum
        for (int x : arr) {
            sum += x;
        }

        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {

            int suffix = sum - prefix - arr[i];

            if (prefix == suffix) {
                System.out.println(i);
                return;
            }

            prefix += arr[i];
        }

        System.out.println(-1);
    }
}