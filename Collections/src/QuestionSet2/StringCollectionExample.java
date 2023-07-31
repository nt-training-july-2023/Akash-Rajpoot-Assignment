package QuestionSet2;

import java.util.ArrayList;
import java.util.List;

public class StringCollectionExample {

    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        List<String> stringList = new ArrayList<>();

        // Add 20 elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");
        stringList.add("Mango");
        stringList.add("Kiwi");
        stringList.add("Pineapple");
        stringList.add("Cherry");
        stringList.add("Watermelon");
        stringList.add("Strawberry");
        stringList.add("Peach");
        stringList.add("Pear");
        stringList.add("Plum");
        stringList.add("Pomegranate");
        stringList.add("Blueberry");
        stringList.add("Raspberry");
        stringList.add("Blackberry");
        stringList.add("Lemon");
        stringList.add("Lime");
        stringList.add("Coconut");

        // Print the elements of the list
        System.out.println("Elements in the String collection:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
