package pattern_wise.sliding_window.Number_of_Substrings_Containing_All_Three_Charactrs.Optimized_solution;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        int result = countSubstrings(s);
        System.out.println("Number of substring containing all three characters : "+result);
    }
    public static int countSubstrings(String s){
        if(s == null || s.isEmpty()) return 0;

        int n = s.length();
        int left = 0;
        int count = 0;

        int[] freq = new int[3]; // a, b, c

        for(int right = 0; right < n; right++){

            freq[s.charAt(right) - 'a']++;

            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){

                count += (n - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return count;
    }
}
