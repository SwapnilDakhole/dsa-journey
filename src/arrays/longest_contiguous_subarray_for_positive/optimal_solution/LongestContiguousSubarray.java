    package arrays.longest_contiguous_subarray_for_positive.optimal_solution;

    // Problem: Longest Contiguous Subarray
    // Given an array of positive integers and a number k,
    // find the length of the longest contiguous subarray
    // whose sum is less than or equal to k.

    public class LongestContiguousSubarray {
        public static void main(String[] args) {
            int[] arr = {2, 5, 1, 7, 10};
            int k = 14;
            int result = longestContiguousSubarray(arr, k);
            System.out.println("Longest contiguous subarray : "+result);
        }
        public static int longestContiguousSubarray(int[] arr, int k){
            if(arr == null || arr.length == 0){
                throw new IllegalArgumentException("Array can not be null or empty");
            }
            int left = 0, right = 0, maxLen = 0, sum = 0;
            int n = arr.length;

            while(right < n){
                sum += arr[right];
                while (sum > k){
                    sum -= arr[left];
                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);

                right++;
            }
            return maxLen;
        }
    }
