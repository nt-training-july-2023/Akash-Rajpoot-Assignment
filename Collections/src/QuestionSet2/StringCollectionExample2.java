package QuestionSet2;

import java.util.HashSet;
import java.util.Set;

public class StringCollectionExample2 {

    public static void main(String[] args) {
        // Create a HashSet to store unique String elements
        Set<String> stringSet = new HashSet<>();

        // Add 20 unique elements to the set
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

        // Print the unique elements in the set
        System.out.println("Elements in the Unique String collection:");
        for (String str : stringSet) {
            System.out.println(str);
        }
    }
}
