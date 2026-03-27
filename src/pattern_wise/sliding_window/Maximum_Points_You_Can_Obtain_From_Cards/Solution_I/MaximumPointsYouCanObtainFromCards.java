package pattern_wise.sliding_window.Maximum_Points_You_Can_Obtain_From_Cards.Solution_I;

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 6, 4, 5, 7};
        int k = 4;

        int result = findMaximumPointsObtain(arr, k);
        System.out.println("Maximum points obtain from cards : "+ result);
    }
    public static int findMaximumPointsObtain(int[] arr, int k){
        if(arr == null || arr.length == 0 || k > arr.length){
            throw new IllegalArgumentException("Invalid input");
        }
        int n = arr.length;
        if(k == n){
            int total = 0;
            for(int num : arr)  total += num;
            return total;
        }

        int totalSum = 0;
        for (int num : arr) totalSum += num;
        int windowSize = n - k;
        int windowSum = 0;
        int miniSum;

        for (int i = 0; i < windowSize; i++) {
            windowSum += arr[i];
        }
        miniSum = windowSum;

        for (int i = windowSize; i < n; i++){
            windowSum += arr[i];
            windowSum -= arr[i - windowSize];

            miniSum = Math.min(miniSum, windowSum);
        }

        return totalSum - miniSum;
    }
}
