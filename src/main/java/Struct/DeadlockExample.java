package Struct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
//
//        Predicate<String> predicate = name -> name.startsWith("A");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> function = number -> number * number;
        Function<Integer, String> functionIntToString = n -> "Number: " + n;

        List<String> words = Arrays.asList("Anna", "Bob", "Alex", "Brad", "Alice");
        System.out.println(byLengthThenAlphabet(words));

    }

    public static List<String> filterList(List<String> list, Predicate<String> predicate) {
        return list.stream()
                .filter(predicate)
                .toList();
    }


    public static <T, R> List<R> transformList(List<T> list, Function<T, R> function) {
        return list.stream()
                .map(function)
                .toList();
    }

    public static List<String> byLengthThenAlphabet(List<String> list) {
        return list.stream()
                .sorted((s1, s2) -> {
                    int cmp = s1.length() - s2.length();
                    if (cmp != 0) return cmp;
                    return s1.compareTo(s2);
                })
                .toList();
    }
}
