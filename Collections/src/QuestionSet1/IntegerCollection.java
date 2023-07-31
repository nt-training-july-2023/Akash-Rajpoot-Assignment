package QuestionSet1;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {

    public static void main(String[] args) {
        // Create an ArrayList to store Integer elements
        List<Integer> integerList = new ArrayList<>();

        // Add 20 elements to the list
        for (int i = 1; i <= 20; i++) {
            integerList.add(i);
        }

        // Print the elements of the list
        System.out.println("Elements in the Integer collection:");
        for (Integer num : integerList) {
            System.out.print(num + " ");
        }
    }
}
