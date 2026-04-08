package stream_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> result = numbers.stream()
                .flatMap(Collection::stream)
                .map(num -> num + 1)
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println(result);
    }
}
