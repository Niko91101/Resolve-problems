package stream_api;

import java.util.Optional;

public class Address {
    private Optional<String> city = Optional.empty();

    public Optional<String> getCity() {
        return city;
    }

}
