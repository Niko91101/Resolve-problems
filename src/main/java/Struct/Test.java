package Struct;

import java.util.*;

public class Test {
    public static void main(String[] args) {

//        List<String> animals = new ArrayList<>();
//        animals.add("sdqwsdqds");
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("a");
//        animals.add("sd");
//        animals.add("bird");
//
//        Collections.sort(animals, new StringLengthComparator());

//        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(1);
        numbers.add(1500);
        numbers.add(15000);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();

        people.add(new Person(3, "Mike"));
        people.add(new Person(1, "Bob"));
        people.add(new Person(2, "Katy"));

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getId(), o2.getId());
            }
        });

        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}

