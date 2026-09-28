package Two_Pointer;

public class Q344_ReverseString {

    public void reverseString(char[] s) {

        int st = 0;
        int end = s.length - 1;

        while (st < end) {
            // Swap the number
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;

            // update the pointers
            st++;
            end--;
        }

        // // Printing the array
        // for (char c : s) {
        //     System.out.print(c + ",");
        // }

    }

    public static void main(String[] args) {

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        Q344_ReverseString q = new Q344_ReverseString();
        q.reverseString(s);
    }
}