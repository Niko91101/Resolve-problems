package resolve_problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", "Moscow", 25),
                new Person("Bob", "Moscow", 30),
                new Person("Charlie", "SPb", 22),
                new Person("Diana", "Kazan", 28),
                new Person("Eve", "SPb", 35)
        );

        Map<String, List<Person>> byCity = Person.groupingByCity(people);

        byCity.forEach((city, persons) -> {
            System.out.println(city + ": " + persons.stream().map(Person::getName).collect(Collectors.joining(", ")));
        });

        Map<String, Long> countingPeopleByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

        System.out.println(countingPeopleByCity);
    }
}

class Person {
    private String name;
    private String city;
    private int age;
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Map<String, List<Person>> groupingByCity(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getCity));
    }
}
