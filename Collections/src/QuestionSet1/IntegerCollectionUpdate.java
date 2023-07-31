package QuestionSet1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerCollectionUpdate {

    public static void main(String[] args) {
        // Create an ArrayList to store Integer elements
        List<Integer> integerList = new ArrayList<>();

        // Add elements to the list
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(60);
        integerList.add(40);
        integerList.add(70);
        integerList.add(80);
        integerList.add(90);

        // Update elements by 5 whenever an element greater than 50 is encountered
        for (int i = 0; i < integerList.size(); i++) {
            int num = integerList.get(i);
            if (num > 50) {
                integerList.set(i, num + 5);
            }
        }

        // Print the updated elements of the list
        System.out.println("Updated elements:");
        for (Integer num : integerList) {
            System.out.print(num + " ");
        }
    }
}
