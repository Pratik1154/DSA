package String;

/**
 * LL_1024_Remove_outer_paranthesis
 */
public class LL_1024_Remove_outer_paranthesis {
    public static void main(String[] args) {
        String str = "(()())";

        int counter = 0;
        String s = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch==')') counter--;
            if (counter != 0) {
                s = s + str.charAt(i);
            }
            if(ch=='(') counter++;
            
        }
        System.out.println(s);
    }

}