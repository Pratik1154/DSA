package Arrays;

public class Rotate_array_by_K {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[(i+k)%arr.length]=arr[i];
        }
    }
}
