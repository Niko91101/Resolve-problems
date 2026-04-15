package stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static Optional<Integer> maxOptional(Optional<Integer> first, Optional<Integer> second) {
        if (first.isEmpty() && second.isEmpty()) {
            return Optional.empty();
        }

        if (first.isPresent() && second.isPresent()) {
            return Optional.of(Integer.max(first.get(), second.get()));
        }
        if (first.isPresent()) {
            return first;
        }

        return second;
    }

    public static Optional<Integer> maxOptionalWithStream(Optional<Integer> first, Optional<Integer> second) {

        return first.flatMap(f -> second.map(s -> Math.max(s, f)))
                .or(() -> first)
                .or(() -> second);
    }
}
