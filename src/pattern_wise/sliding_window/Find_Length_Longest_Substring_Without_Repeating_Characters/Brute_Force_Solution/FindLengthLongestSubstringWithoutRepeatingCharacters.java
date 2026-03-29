package pattern_wise.sliding_window.Find_Length_Longest_Substring_Without_Repeating_Characters.Brute_Force_Solution;

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
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[256];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if(freq[ch] == 1)   break;
                freq[ch]++;
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
