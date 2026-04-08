package resolve_problems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
//
//        Consumer<Integer> consumer = System.out::println;
//
//        Problem.forEachWithDelay(numbers, consumer, 5000);

//        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100) + 1;
//
//        int[] next = {1};
//        Supplier<Integer> sequentialSupplier = () -> next[0]++;
//
//        System.out.println(Problem.generateList(randomSupplier, 100));
//        System.out.println(Problem.generateList(sequentialSupplier, 100));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Function<Integer, Integer> sqrt = num -> num * num;

        numbers.stream()
                .filter(isEven)
                .map(sqrt)
                .forEach(System.out::println);
    }
}
