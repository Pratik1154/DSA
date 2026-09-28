package SlidingWindow;

/**
 * Q424_Longest_Repeating_characrter_Replacement
 */
public class Q424_Longest_Repeating_characrter_Replacement {

    public static int longestSubstring(String s, int k) {

        int right = 0, left = 0, maxLen = 0, maxfreq = 0;
        int[] count = new int[26];

        while (right < s.length()) {

            count[s.charAt(right)-'A']++;

            maxfreq = Math.max(maxfreq, count[s.charAt(right)-'A']);

            while ((right - left + 1) - maxfreq > k) {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int replacable = 1;
        System.out.println(longestSubstring(s, replacable));
    }
}