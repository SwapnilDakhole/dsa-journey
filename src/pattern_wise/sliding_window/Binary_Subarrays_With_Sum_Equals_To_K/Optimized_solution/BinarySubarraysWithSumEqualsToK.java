package pattern_wise.sliding_window.Binary_Subarrays_With_Sum_Equals_To_K.Optimized_solution;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int k = 2;
        int result = findBinarySubarrayWithSumEqualsToK(arr, k);
        System.out.println("Binary subarray with sum equals to k :"+result);
    }
    public static int findBinarySubarrayWithSumEqualsToK(int[] arr, int k){
        if(arr == null || arr.length == 0)  return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for(int num : arr){
            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
