package stream_api;

import java.util.List;
import java.util.Optional;

public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Optional<User> findUserById(List<User> users, int id) {
        if (users == null) return Optional.empty();

        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst();

    }
}
