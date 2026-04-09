package pattern_wise.sliding_window.Average_Of_Subarrays_Of_Size_K.Optimized_solution;
/*
    Problem: Maximum Average Subarray of Size K

    Approach: Fixed Sliding Window

    Key Idea:
    - Since subarray size is fixed (k), we use a sliding window of size k.
    - First, calculate the sum of the initial window (first k elements).
    - Then slide the window one element at a time:
        - Add the next element (right side)
        - Remove the previous element (left side)
    - At each step, compute the average and track the maximum.

    Important Points:
    - Always handle edge cases:
        * null or empty array
        * k > array length
    - Use float/double for average to avoid integer division loss.
    - First window must be processed before sliding.
    - Time Complexity: O(n)
    - Space Complexity: O(1)

    Pattern:
    - Fixed Size Sliding Window

    Use Cases:
    - When problem mentions "subarray of size k"
    - Optimize brute-force O(n*k) → O(n)

    Template:
    1. Compute initial window sum (size k)
    2. Slide window:
        windowSum += arr[i]
        windowSum -= arr[i - k]
    3. Update result
*/
public class AverageOfSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 7, 4};
        int k = 3;

        float result = findAverageOfSubarrays(arr, k);

        System.out.println("Average of subarrays : " + result);
    }
    public static float findAverageOfSubarrays(int[] arr, int k){
        if(arr == null || arr.length == 0 || k > arr.length)   return 0;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        float maxAvg = (float) windowSum / k;

        for(int i = k; i< arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];

            float avg = (float) windowSum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}
