import java.math.*;
import java.util.*; 
public class CheckArmstrongNumber {
    // Method to Count the Length of Number
    public static int countLength(int number){
        int length = 0;
        while(number != 0){
            number = number/10;
            length++;
        }
        return length;
    }
// Method to check for Armstrong number
    public static boolean isArmstrong(int number,int length){
        long powerSum = 0;
        int n = number; 
        while (n!= 0) {
            int lastDigit = n % 10;
            powerSum += (int)Math.pow(lastDigit,length);
            n = n/10;
        }
        System.out.println(powerSum);
        return (powerSum == number);
    }
    
    //Driver Code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to check for");
        int number = scan.nextInt();
        int size = countLength(number);
        System.out.println(isArmstrong(1634, size));
    }


}
