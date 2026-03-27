package pattern_wise.sliding_window.Maximum_Points_You_Can_Obtain_From_Cards.Solution_II;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 6, 4, 5, 7};
        int k = 4;

        int result = findMaximumPointsObtain(arr, k);
        System.out.println("Maximum points obtain from cards : "+ result);
    }
    public static int findMaximumPointsObtain(int[] arr, int k){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid input");
        }

        int leftSum = 0;
        for (int i = 0; i < k; i++) {
            leftSum += arr[i];
        }

        int maxSum = leftSum;
        int rightSum = 0;
        int right = arr.length-1;
        for (int i = k-1; i >=0; i--) {
            leftSum -= arr[i];
            rightSum += arr[right];
            right--;

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}
