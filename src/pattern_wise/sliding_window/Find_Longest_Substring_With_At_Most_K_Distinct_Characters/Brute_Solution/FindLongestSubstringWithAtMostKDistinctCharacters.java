package pattern_wise.sliding_window.Find_Longest_Substring_With_At_Most_K_Distinct_Characters.Brute_Solution;

import java.util.HashSet;
import java.util.Set;

public class FindLongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        String s = "aaabbcdd";
        int k = 2;
        int result = findLongestSubstring(s, k);
        System.out.println("Longest substring with at most K distinct characters :" + result);
    }
    public static int findLongestSubstring(String s, int k){
        if(s == null || s.isEmpty() || k == 0)    return 0;

        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                set.add(s.charAt(j));
                if(set.size() > k) break;

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
