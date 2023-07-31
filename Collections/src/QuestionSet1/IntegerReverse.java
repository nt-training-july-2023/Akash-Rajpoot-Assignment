package QuestionSet1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerReverse {

    public static void main(String[] args) {
        // Create an ArrayList to store Integer elements
        List<Integer> integerList = new ArrayList<>();

        // Add 20 elements to the list
        for (int i = 1; i <= 20; i++) {
            integerList.add(i);
        }

        // Print the elements of the list in reverse order without using for loop
        System.out.println("Elements in reverse order:");
        Collections.reverse(integerList);
        for (Integer i:integerList) {
            System.out.println(i);
        }
    }
}
