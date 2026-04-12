package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of(
                "Алексей", "Анна", "Борис",
                "Андрей", "Виктор", "Алина"
        );

        List<String> namesStartsWithA = names.stream()
                .filter(name -> name.startsWith("А"))
                .sorted()
                .toList();

        System.out.println(namesStartsWithA);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        List<String> words = List.of(
                "яблоко", "банан", "апельсин",
                "груша", "киви", "манго"
        );

        String word = words.stream()
                .max(Comparator.comparing(String::length))
                .orElseThrow(() -> new RuntimeException("Список пустой"));

        System.out.println(word);
    }
}
