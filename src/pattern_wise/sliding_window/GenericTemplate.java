package pattern_wise.sliding_window;


public class GenericTemplate {
    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 4, 5, 6};
        int k = 3;

        int windowSum = 0;
        int result = Integer.MIN_VALUE; // depends on problem

        // 1. Build first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // 2. Update result for first window
        result = Math.max(result, windowSum);

        // 3. Slide the window
        for (int i = k; i < arr.length; i++) {

            // Add next element
            windowSum += arr[i];

            // Remove element going out of window
            windowSum -= arr[i - k];

            // Update result
            result = Math.max(result, windowSum);
        }

        System.out.println("Result: " + result);
    }
}



/*

How to Identify Fixed Window?

Look for these keywords:

        ✅ “Subarray of size K”
        ✅ “Window size = K”
        ✅ “Find max/min/avg of K elements”

        👉 Immediately think: Fixed Window

*/
