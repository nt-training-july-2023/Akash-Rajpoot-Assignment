package EvenNumber;

import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            checkEvenNumber(number);
            System.out.println("It's an even number.");
        } catch (NotEvenNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
    public static void checkEvenNumber(int number) throws NotEvenNumberException {
        if (number % 2 != 0) {
            throw new NotEvenNumberException("The number is not even.");
        }
    }
}