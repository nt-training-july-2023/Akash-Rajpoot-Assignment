import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reversed = 0;
        while (number > 0) {
            //GETTING THE LAST DIGIT WITH % OPERATOR WITH 10
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            // REDUCING THE NUMBER FROM BACK 
            number = number/10; 
        }
        System.out.println(reversed);
    }
}
