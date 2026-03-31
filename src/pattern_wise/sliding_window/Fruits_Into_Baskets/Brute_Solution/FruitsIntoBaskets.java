package pattern_wise.sliding_window.Fruits_Into_Baskets.Brute_Solution;

import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBaskets {
//    Find the longest subarray with at most 2 distinct numbers
        // input: 0,1,2,2   Output: 3
        // input: 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4    Output: 5
        // input: 1,2,3,2,2   Output: 4

    public static void main(String[] args) {
        int[] arr = {0,1,2,2};
        int result = findFruitsIntoBuckets(arr);
        System.out.println("Fruits into buckets : "+result);
    }
    public static int findFruitsIntoBuckets(int[] arr){
        if(arr == null || arr.length == 0)  return 0;

        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i; j < arr.length; j++) {
                set.add(arr[j]);

                if(set.size() > 2)  break;

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
