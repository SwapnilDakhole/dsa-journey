package arrays.maximum_points_obtain_from_cards;

// Problem: Maximum Points You Can Obtain from Cards
// You are given an array of card points.
// You can pick exactly k cards from either the beginning or the end of the array.
// Return the maximum points you can obtain.

public class MaximumPointsObtainFromCards {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int n = arr.length;
        int rightSum = 0, leftSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum + arr[i];

        }
        maxSum = leftSum;
        int rightIndex = n-1;

        for (int i = k-1; i >= 0 ; i--) {
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rightIndex];
            rightIndex--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }

        System.out.println("Maximum points obtained from the cards: "+ maxSum);
    }
}
