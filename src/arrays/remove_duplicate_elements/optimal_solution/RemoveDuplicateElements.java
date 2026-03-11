package arrays.remove_duplicate_elements.optimal_solution;

// Remove duplicate elements and returns the final count of unique elements
// Works only for sorted arrays

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3};
        int result = removeDuplicateElements(arr);
        System.out.println("Unique count: "+ result);

    }
    public static int removeDuplicateElements(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array can not be null or empty");
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
