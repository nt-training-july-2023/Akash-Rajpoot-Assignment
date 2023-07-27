/**
 * This is a AtmSystem class
 * @author Akash Rajpoot
 * @version 1.0
 * since 26-07-2023**/

package ATM;
public class AtmSystem {
    private double accountBalance;
    public AtmSystem(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void withDraw(double withdrawAmount)throws InvalidInputException{
        if(withdrawAmount <= 0 ){
            throw new InvalidInputException("Invalid Amount Entered Please Enter a Positive Value");
        }else if(withdrawAmount > accountBalance){
            throw new InvalidInputException("The withdrwal Amount is greater than your Account Balance Please Enter a smaller Value");
        }else{
            accountBalance -= withdrawAmount;
            System.out.println("Withdraw Successful curreent Account balance is"+accountBalance );
        }


    }

}
