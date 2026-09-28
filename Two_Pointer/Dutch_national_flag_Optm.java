package Two_Pointer;

public class Dutch_national_flag_Optm {
    public static int[] dutchNationalFlag(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                // swap with low and increment both

                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                //  swap with the high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                
                high--;
            }
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
