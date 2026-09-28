package SlidingWindow;

import java.util.HashMap;

public class Q3_LongestSubstring_Optimal {
         public static int longestSubstring(String s){
            
            HashMap<Character, Integer> hash = new HashMap<>();

            int left = 0, right = 0, maxlen = 0;
            while(right<s.length()){
                char ch = s.charAt(right);
                if(hash.containsKey(ch)){
                    if(hash.get(ch)>=left){
                        left = hash.get(ch)+1;
                    }
                }
                int len = right-left+1;
                maxlen = Math.max(len,maxlen);

                hash.put(ch, right);
                
                right++;
            }
            return maxlen;
        }
    public static void main(String[] args) {

        String str = "abcabcbb";
        System.out.println(longestSubstring(str));
    }
}
