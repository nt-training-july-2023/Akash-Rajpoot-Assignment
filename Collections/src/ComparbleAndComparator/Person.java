package ComparbleAndComparator;

import java.util.*;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on their age
        return this.age - otherPerson.age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }

    public <T> Comparable<T> getName() {
        return (Comparable<T>) name;
    }
}
