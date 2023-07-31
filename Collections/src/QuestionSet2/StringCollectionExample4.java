package QuestionSet2;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringCollectionExample4 {

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

        // Print the elements in the set
        System.out.println("Elements in the Unique String collection with insertion order:");
        printElements(stringSet);

        // Check if the set contains a specific element
        String searchElement = "Mango";
        if (containsElement(stringSet, searchElement)) {
            System.out.println(searchElement + " is present in the set.");
        } else {
            System.out.println(searchElement + " is not present in the set.");
        }

        // Get the size of the set
        int size = getSize(stringSet);
        System.out.println("Size of the set: " + size);

        // Remove an element from the set
        String removeElement = "Strawberry";
        removeElement(stringSet, removeElement);
        System.out.println("Elements in the set after removing " + removeElement + ":");
        printElements(stringSet);

        // Clear all elements from the set
        clearSet(stringSet);
        System.out.println("Elements in the set after clearing:");
        printElements(stringSet);
    }

    // Method to print elements in the set
    private static void printElements(Set<String> set) {
        for (String str : set) {
            System.out.println(str);
        }
    }

    // Method to check if the set contains a specific element
    private static boolean containsElement(Set<String> set, String element) {
        return set.contains(element);
    }

    // Method to get the size of the set
    private static int getSize(Set<String> set) {
        return set.size();
    }

    // Method to remove an element from the set
    private static void removeElement(Set<String> set, String element) {
        set.remove(element);
    }

    // Method to clear all elements from the set
    private static void clearSet(Set<String> set) {
        set.clear();
    }
}
