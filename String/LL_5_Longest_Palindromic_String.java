package String;

public class LL_5_Longest_Palindromic_String {
    public static boolean isPalindrom(String s){
        String str = "";
        for(int i = s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        return str.equals(s);
    }
    public static String longestPalindromic(String s){
        String longest="";
        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                String subString = s.substring(i, j+1);
                if(isPalindrom(subString) && subString.length()>longest.length()){
                    longest = subString;
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindromic(s));
    }
}
