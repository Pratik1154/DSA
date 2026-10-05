package String;

/**
 * LL_1614_Maximum_Nesting_Depth
 */
public class LL_1614_Maximum_Nesting_Depth {

    public static int maxDepth(String s) {

        int counter = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(')
                counter++;
            if (ch == ')')
                counter--;

            max = Math.max(max, counter);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}