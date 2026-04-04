package pattern_wise.sliding_window.Maximum_Sum_Subarray_of_Size_K.Optimized_solution;


public class MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 7, 4};
        int k = 3;

        int result = findMaximumSumSubarray(arr, k);
        System.out.println("Maximum sum subarray of size k : "+result);
    }
    public static int findMaximumSumSubarray(int[] arr, int k){
        if(arr == null || arr.length == 0 || k > arr.length){
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
