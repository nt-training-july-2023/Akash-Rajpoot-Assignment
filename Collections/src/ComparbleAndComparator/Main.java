package ComparbleAndComparator;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 20));
        persons.add(new Person("Charlie", 30));

        // Sorting using Comparable (natural ordering based on age)
        Collections.sort(persons);
        System.out.println("Sorted by age (natural ordering):");
        System.out.println(persons);

        // Sorting using Comparator (custom ordering based on name)
        NameComparator nameComparator = new NameComparator();
        Collections.sort(persons, nameComparator);
        System.out.println("\nSorted by name:");
        System.out.println(persons);
    }
}
