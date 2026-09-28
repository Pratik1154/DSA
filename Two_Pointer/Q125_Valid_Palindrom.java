package Two_Pointer;

/**
 * Q125_Valid_Palindrom
 */
public class Q125_Valid_Palindrom {

    public static boolean isPalindrom(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int st = 0;
        int end = str.length() - 1;
        while (st < end) {
            if (str.charAt(st) != str.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrom(s));
    }
}