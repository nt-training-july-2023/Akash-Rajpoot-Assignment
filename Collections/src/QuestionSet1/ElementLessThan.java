package QuestionSet1;

import java.util.ArrayList;
import java.util.List;

public class ElementLessThan {

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

        // Display elements less than 60
        System.out.println("Elements less than 60:");
        for (Integer num : integerList) {
            if (num < 60) {
                System.out.print(num + " ");
            }
        }
    }
}
