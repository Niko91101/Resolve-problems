package resolve_problems;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//
//        Consumer<Integer> consumer = System.out::println;
//
//        Problem.forEachWithDelay(numbers, consumer, 5000);

        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;

        int[] next = {1};
        Supplier<Integer> sequentialSupplier = () -> next[0]++;

        System.out.println(Problem.generateList(randomSupplier, 100));
        System.out.println(Problem.generateList(sequentialSupplier, 100));
    }
}
