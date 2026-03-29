package pattern_wise.sliding_window.Find_Length_Longest_Substring_Without_Repeating_Characters.Optimized_Solution.Solution_II;

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

        int left = 0;
        int maxLen = 0;
        int[] freq = new int[256];

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            freq[ch]++;
            while(freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
