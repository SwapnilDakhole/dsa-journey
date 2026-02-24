package arrays.second_largest_element;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,6,8};
        int result = findSecondLargestElement(arr);
        System.out.println(result);
    }

    private static int findSecondLargestElement(int[] arr) {
        if(arr == null || arr.length < 2) return -1;
        int max = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        return (secondLargest == Integer.MIN_VALUE) ? -1: secondLargest;
    }
}
