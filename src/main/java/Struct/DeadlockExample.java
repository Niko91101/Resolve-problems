package Struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(array1);
        fillList(list1);

        //map
        array1 = Arrays.stream(array1)
                .map(x -> x * 2)
                .toArray();

        list1 = list1.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        //filter


//        System.out.println(Arrays.toString(array1));
//        System.out.println(list1);

        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(array2);
        fillList(list2);

        array2 = Arrays.stream(array2)
                .filter(x -> x % 2 == 0)
                .toArray();

        //System.out.println(Arrays.toString(array2));

        //forEach

        //reduce

        //

        int result = Arrays.stream(array2)
                .reduce((acc, b) -> acc + b)
                .orElse(-1);

        System.out.println(result);


    }

    private static void fillArr(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
