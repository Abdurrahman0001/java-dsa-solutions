package dsa.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            char c = s.charAt(end);

            if (!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, end - start + 1);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }

        }
        return maxLen;
    }
}
