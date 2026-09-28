package SlidingWindow;


public class Q3_LongestSubstring_BruitForce {
    
    public static int longestSubstrig(String s){

        int maxlen = 0;
        for(int i = 0; i<s.length();i++){
            int[] hased = new int[256];
            for(int j = i;j<s.length();j++){
                if(hased[s.charAt(j)]==1){
                    break; 
                }
                hased[s.charAt(j)]=1;
                int len = j-i+1;
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstrig(s));
    }
}
