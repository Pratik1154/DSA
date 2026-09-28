package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Q76_Minimum_window_Substring {

    public static String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0, minLen = Integer.MAX_VALUE;
        int have = 0, need = map.size(), start = 0;
        Map<Character, Integer> window = new HashMap<>();

        while (right < s.length()) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) && window.get(ch).intValue() == map.get(ch).intValue()) {
                have++;
            }

            while (have == need) {

                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)) {
                    have--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}