package pattern_wise.sliding_window.Longest_Repeating_Character_Replacement.Brute_Solution;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 2;
        int result = findLongestRepeatingCharacterReplacement(s, k);
        System.out.println("Longest repeating character replacement : "+result);
    }
    public static int findLongestRepeatingCharacterReplacement(String s, int k){
        if(s == null || s.isEmpty())    return 0;
        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[256];
            int maxFreq = 0;
            for(int j = i; j < s.length(); j++){
                freq[s.charAt(j)]++;
                int windowSum = j - i + 1;
                maxFreq = Math.max(maxFreq, freq[s.charAt(j)]);
                int changes = windowSum - maxFreq;

                if(changes > k) break;

                maxLen = Math.max(maxLen, windowSum);
            }
        }
        return maxLen;
    }
}
