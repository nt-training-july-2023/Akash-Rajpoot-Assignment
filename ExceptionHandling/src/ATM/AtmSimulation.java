/**
 * This is a Atm Simulation class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/

package ATM;

import java.util.Scanner;

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please Enter account Balance");
            double accountBalance = Double.parseDouble(scan.nextLine());

            if(accountBalance < 0 ){
                throw new InvalidInputException("Invalid Account Balance please enter Non Negative Value");
            }
            System.out.println("Please Enter withdrawal amount");
            double withdrawamount = Double.parseDouble(scan.nextLine());

            if(withdrawamount < 0){
                throw new InvalidInputException("Invalid withdraw Amount please enter Non Negative Value");
            }

            AtmSystem atm = new AtmSystem(12000);
            atm.withDraw(withdrawamount);

        }catch (NumberFormatException ex){
            System.out.println("Invalid input format. Please enter numeric values only.");
        }catch (InvalidInputException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        scan.close();
    }
}
