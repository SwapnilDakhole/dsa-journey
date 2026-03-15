package arrays.move_zero_at_end.brute_solution;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 0, 5, 4};

        List<Integer> numbers = new ArrayList<>();

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array can not be null or empty");
        }

        for (int num: arr){
            if(num != 0)    numbers.add(num);
        }
        int index = 0;
        for (int num: numbers){
            arr[index] = num;
            index++;
        }
        for (int i = numbers.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int num: arr){
            System.out.print(num+" ");
        }
    }
}
