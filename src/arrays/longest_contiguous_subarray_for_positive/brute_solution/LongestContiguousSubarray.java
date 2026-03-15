package arrays.longest_contiguous_subarray_for_positive.brute_solution;

// Problem: Longest Contiguous Subarray
// Given an array of positive integers and a number k,
// find the length of the longest contiguous subarray
// whose sum is less than or equal to k.

public class LongestContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int k = 14;
        int result = longestContiguousSubarray(arr, k);
        System.out.println(result);
    }

    private static int longestContiguousSubarray(int[] arr, int k) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array can not be null or empty");
        }
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum > k) break;

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
