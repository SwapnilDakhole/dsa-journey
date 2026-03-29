package pattern_wise.sliding_window.Find_Length_Longest_Substring_Without_Repeating_Characters.Optimized_Solution.Solution_I;

import java.util.Set;
import java.util.HashSet;

public class FindLengthLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        int result = findLongestSubstring(s);
        System.out.println("Longest substring without repeating characters : "+result);
    }
    public static int findLongestSubstring(String s){
        if(s == null || s.isEmpty()){
            return 0;
        }
        Set<Character> counter = new HashSet<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < s.length()){
            while(counter.contains(s.charAt(right))){
                counter.remove(s.charAt(left));
                left++;
            }

            counter.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
