package Two_Pointer;

/**
 * Dutch_national_flag
 */
public class Dutch_national_flag {

    public static int[] dutchNationalFlag(int[] arr) {

        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeros++;
            else if (arr[i] == 1)
                ones++;
            else
                twos++;
        }

        // overwrite the array
        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }
        for (int i = zeros; i < zeros + ones; i++) {
            arr[i] = 1;
        }
        for (int i = zeros + ones; i < arr.length; i++) {
            arr[i] = 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        int[] sorted = dutchNationalFlag(arr);

        for (int x : sorted) {
            System.out.print(x + ",");
        }
    }
}