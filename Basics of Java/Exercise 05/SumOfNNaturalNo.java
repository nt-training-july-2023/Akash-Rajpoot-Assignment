import java.util.*;
public class SumOfNNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // PROGRAM TO CALCULATE SUM OF NATURAL NUMBERS
        int n = sc.nextInt();
        System.out.println("Enter the N");
        int sum = n * (n+1)/2;
        System.out.println(sum);
    }
}

