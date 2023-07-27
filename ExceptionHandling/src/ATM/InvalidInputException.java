/**
 * This is a ExceptionHandler class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/


package ATM;

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
}
