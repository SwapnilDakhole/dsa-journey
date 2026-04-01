package pattern_wise.sliding_window.Find_Longest_Substring_With_At_Most_K_Distinct_Characters.Optimized_Solution;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringWithAtMostKDistinctCharacters {
    public static void main(String[] args) {
        String s = "aaabbcdd";
        int k = 2;
        int result = findLongestSubstring(s, k);
        System.out.println("Longest substring with at most K distinct characters :" + result);
    }
    public static int findLongestSubstring(String s, int k){
        if(s == null || s.isEmpty() || k == 0)  return 0;

        int left = 0, maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0)+ 1);

            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
