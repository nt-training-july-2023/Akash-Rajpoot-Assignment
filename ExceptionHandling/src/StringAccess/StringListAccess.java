package StringAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringListAccess {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index to access the element: ");
            int index = Integer.parseInt(scanner.nextLine());

            if (stringList == null) {
                throw new NullPointerException("The list is null. Please initialize the list first.");
            }

            if (index < 0 || index >= stringList.size()) {
                throw new IndexOutOfBoundsException("Invalid index. The valid index range is 0 to " + (stringList.size() - 1) + ".");
            }

            String element = stringList.get(index);
            System.out.println("Element at index " + index + ": " + element);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input format. Please enter a valid index as an integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
