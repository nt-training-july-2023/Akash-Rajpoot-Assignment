package ComparbleAndComparator;

import java.util.*;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        // Compare persons based on their names
        return p1.getName().compareTo(p2.getName());
    }
}
