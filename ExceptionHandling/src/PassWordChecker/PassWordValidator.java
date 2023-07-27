package PassWordChecker;

import java.util.Scanner;

public class PassWordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            validatePassword(password);
            System.out.println("Password is valid!");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid Password: " + e.getMessage());
        }
    }

    public static void validatePassword(String password) throws InvalidPasswordException {
        // Check if the password has at least eight characters
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must have at least eight characters.");
        }

        // Check if the password contains both letters and numbers
        boolean containsLetter = false;
        boolean containsNumber = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) {
                containsLetter = true;
            } else if (Character.isDigit(ch)) {
                containsNumber = true;
            }
        }

        if (!containsLetter || !containsNumber) {
            throw new InvalidPasswordException("Password must contain both letters and numbers.");
        }
    }
}
