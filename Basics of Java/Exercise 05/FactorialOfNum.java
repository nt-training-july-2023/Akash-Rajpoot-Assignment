import java.util.*;
public class FactorialOfNum {
    public static void main(String[] args) {
        // PROGRAM TO CALCULATE FACTORIAL OF A NUMBER
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;

        for(int i =1;i<=number;i++){
            factorial *= i;
        }
        System.out.println(factorial);
        
    }
}
