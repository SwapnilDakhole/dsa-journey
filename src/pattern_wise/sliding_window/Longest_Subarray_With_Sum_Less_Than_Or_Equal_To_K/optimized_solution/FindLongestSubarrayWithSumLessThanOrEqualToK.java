package pattern_wise.sliding_window.Longest_Subarray_With_Sum_Less_Than_Or_Equal_To_K.optimized_solution;

public class FindLongestSubarrayWithSumLessThanOrEqualToK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5};
        int k = 14;

        int result = findLongestSubarrayWithSum(arr, k);
        System.out.println("Longest subarray with sum ≤ k: "+ result);
    }
    public static int findLongestSubarrayWithSum(int[] arr, int k){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid input");
        }

        int left = 0, right = 0;
        int maxLen = 0;
        int maxSum = 0;
        while(right < arr.length){
            maxSum += arr[right];

            while(maxSum > k){
                maxSum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }
        return maxLen;
    }
}
