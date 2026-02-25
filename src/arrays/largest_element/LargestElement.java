package arrays.largest_element;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,6,8};
        int result = findLargestElement(arr);
        System.out.println(result);
    }

    private static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
}
