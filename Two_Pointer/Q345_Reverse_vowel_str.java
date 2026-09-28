package Two_Pointer;

/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede" */

public class Q345_Reverse_vowel_str {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {

        int st = 0, end = s.length() - 1;

        char[] ch = s.toCharArray();

        while (st < end) {
            while (st < end && !isVowel(ch[st])) {
                st++;
            }
            while (st < end && !isVowel(ch[end])) {
                end--;
            }
            // Swap
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;

            st++;
            end--;

        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {

        String s = "IceCreAm";
        Q345_Reverse_vowel_str q = new Q345_Reverse_vowel_str();
        System.out.println(q.reverseVowels(s));
        
    }

}
