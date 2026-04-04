package pattern_wise.sliding_window.Maximum_Sum_Subarray_of_Size_K.Brute_solution;

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

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length - k; i++){
            int sum = 0;

            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
