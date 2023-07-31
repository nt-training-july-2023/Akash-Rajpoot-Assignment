package Question3;

import java.util.Scanner;

public class MultipleOperation {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a Positive Number");
        int maxNum = input.nextInt();
        if(maxNum <= 0){
            System.out.println("Please Enter a Positive Value");
        }
        ReverseNumber r1= new ReverseNumber(maxNum);
        SumOfNumber s1= new SumOfNumber(maxNum);
        FibonacciSeries f1= new FibonacciSeries(maxNum);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(f1);

        try{

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

