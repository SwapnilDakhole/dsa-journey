package pattern_wise.sliding_window.Number_of_Substrings_Containing_All_Three_Charactrs.Brute_solution;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        int result = countSubstrings(s);
        System.out.println("Number of substring containing all three characters : "+result);
    }
    public static int countSubstrings(String s){
        if(s == null || s.isEmpty()) return 0;

        int n = s.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            Set<Character> set = new HashSet<>();

            for(int j = i; j < n; j++){
                set.add(s.charAt(j));

                if(set.size() == 3){
                    count++;
                }
            }
        }

        return count;
    }
}
