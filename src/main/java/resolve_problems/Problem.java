package resolve_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Problem {

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

    public static <T> void forEachWithDelay(List<T> list, Consumer<T> action, int delayMs) {
        for (T num : list) {
            action.accept(num);
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public static <T> List<T> genarateList(Supplier<T> supplier, int count) {
        List<T> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(supplier.get());
        }

        return list;
    }
}
