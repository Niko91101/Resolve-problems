package resolve_problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Consumer<Integer> consumer = System.out::println;

        Problem.forEachWithDelay(numbers, consumer, 5000);
    }
}
