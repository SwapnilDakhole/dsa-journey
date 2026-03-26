package pattern_wise.sliding_window.Longest_Subarray_With_Sum_Less_Than_Or_Equal_To_K.brute_force;

public class FindLongestSubarrayWithSumLessThanOrEqualToK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5};
        int k = 14;

        int result = findLongestSubarrayWithSum(arr, k);
        System.out.println("Longest subarray with sum ≤ k: "+ result);
    }

    public static int findLongestSubarrayWithSum(int[] arr, int k){
        if(arr == null || arr.length == 0 ) {
            throw new IllegalArgumentException("Invalid input");
        }

        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum <= k){
                    maxLen = Math.max(maxLen, j - i + 1);
                } else  {
                    break;
                }
            }
        }

        return maxLen;
    }

}
