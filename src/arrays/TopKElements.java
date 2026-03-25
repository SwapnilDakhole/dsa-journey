package arrays;

import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,6,7,3,4};
        int k = 3;

        Map<Integer, Integer> numbers = new TreeMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num: arr){
            numbers.put(num, numbers.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numbers.entrySet());

        System.out.println(list);

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println(list);

        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

//        int counter = 0;
//        for (Map.Entry<Integer, Integer> entry: numbers.entrySet()){
//            if(entry.getValue() == k){
//                result.add(entry.getKey());
//                counter++;
//            }
//            if(counter == k)  break;
//        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
