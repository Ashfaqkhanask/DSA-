import java.util.*;

public class longestSubstringWithDistinctCharacter {
    public static void main(String[] args) {
        String s = "ashfaq khan";
        int result = longestSubstring(s);
        System.out.println("Length of longest substring with all distinct characters: " + result);
    }

    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If duplicate, shrink window from left until character is removed
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
