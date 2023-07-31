package QuestionSet2;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringCollectionExample3 {

    public static void main(String[] args) {
        // Create a LinkedHashSet to store unique String elements while preserving insertion order
        Set<String> stringSet = new LinkedHashSet<>();

        // Add 20 unique elements to the set while preserving insertion order
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Mango");
        stringSet.add("Kiwi");
        stringSet.add("Pineapple");
        stringSet.add("Cherry");
        stringSet.add("Watermelon");
        stringSet.add("Strawberry");
        stringSet.add("Peach");
        stringSet.add("Pear");
        stringSet.add("Plum");
        stringSet.add("Pomegranate");
        stringSet.add("Blueberry");
        stringSet.add("Raspberry");
        stringSet.add("Blackberry");
        stringSet.add("Lemon");
        stringSet.add("Lime");
        stringSet.add("Coconut");

        // Print the unique elements while preserving insertion order
        System.out.println("Elements in the Unique String collection with insertion order:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
