package ArrayAccces;

import java.util.Scanner;

public class IntegerArrayAccess {
    public static void main(String[] args) {
        int[] integerArray = { 10, 20, 30, 40, 50 };

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index to access the element: ");
            int index = Integer.parseInt(scanner.nextLine());

            if (integerArray == null) {
                throw new NullPointerException("The array is null. Please initialize the array first.");
            }

            if (index < 0 || index >= integerArray.length) {
                throw new IndexOutOfBoundsException("Invalid index. The valid index range is 0 to " + (integerArray.length - 1) + ".");
            }

            int element = integerArray[index];
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
