package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Q304_Longest_substring_with_K_distinct
 */
public class Q304_Longest_substring_with_K_distinct {

    public static int longestSubstring(String str){
        int left = 0, right = 0, maxLen = 0;
        Map<Character,Integer> map = new HashMap<>();

        while(right<str.length()){
            char ch = str.charAt(right);
            map.put(ch,map.getOrDefault(ch,0 )+1);

            while(map.size()>2){
                char c = str.charAt(left);
                map.put(c, map.get(c)-1);
                if (map.get(c)==0) {
                    map.remove(c);
                }
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "aaabbccd";
        System.out.println(longestSubstring(s));
    }
}