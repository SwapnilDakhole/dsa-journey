package pattern_wise.sliding_window.Fruits_Into_Baskets.Optimized_Solution;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    //    Find the longest subarray with at most 2 distinct numbers
    // input: 0,1,2,2   Output: 3
    // input: 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4    Output: 5
    // input: 1,2,3,2,2   Output: 4

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        int result = findFruitsIntoBuckets(arr);
        System.out.println("Fruits into buckets : "+result);
    }

    public static int findFruitsIntoBuckets(int[] arr){
        if(arr == null || arr.length == 0)  return 0;

        int left = 0;
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < arr.length; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while(map.size() > 2){
                map.put(arr[left], map.get(arr[left]) - 1);

                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
