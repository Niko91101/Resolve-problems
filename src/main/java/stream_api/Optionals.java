package stream_api;

import java.util.List;
import java.util.Optional;

public class Optionals {

    public static Optional<Integer> maxEven(List<Integer> list) {

        if (list.isEmpty()) {
            return Optional.empty();
        }

        return list.stream()
                .filter(num -> num % 2 == 0)
                .max(Integer::compareTo);

    }
}
