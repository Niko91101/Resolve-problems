package stream_api;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int maxEven = Optionals.maxEven(numbers).orElseThrow(() -> new IllegalArgumentException("No even digit"));

        System.out.println(maxEven);

    }
}
