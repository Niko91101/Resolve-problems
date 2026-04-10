package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<User> users = List.of(
                new User(1, "Alice"),
                new User(2, "Bob"),
                new User(3, "Charlie"),
                new User(4, "Diana")
        );

        User.findUserById(users, 4)
                .ifPresentOrElse(
                        user -> System.out.println(user.getName().toUpperCase()),
                        () -> System.out.println("User not found")
                );
    }

    private static Optional<Integer> safeToInt(String s) {
        if (s == null) return Optional.empty();

        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
