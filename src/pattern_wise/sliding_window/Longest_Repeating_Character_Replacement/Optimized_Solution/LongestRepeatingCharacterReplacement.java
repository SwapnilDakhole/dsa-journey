package pattern_wise.sliding_window.Longest_Repeating_Character_Replacement.Optimized_Solution;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        int result = findLongestRepeatingCharacterReplacement(s, k);
        System.out.println("Longest repeating character replacement : "+result);
    }
    public static int findLongestRepeatingCharacterReplacement(String s, int k){
        if(s == null || s.isEmpty())    return 0;

        int left = 0, maxLen = 0, maxFreq = 0;
        int[] freq = new int[256];

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right)]++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right)]);

            while((right - left + 1) - maxFreq > k){
                freq[s.charAt(left)]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
