package Struct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        //

        // [1] -> [2] -> [3]
        measureTime(linkedList);
        measureTime(arrayList);

    }

    private static void  measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000_00; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }


}
