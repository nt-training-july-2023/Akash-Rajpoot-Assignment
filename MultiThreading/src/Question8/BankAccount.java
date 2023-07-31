package Question8;

public class BankAccount {
    private int balance;
    public BankAccount(int initialBalance){
        this.balance = initialBalance;
    }
    //Synchronised method to deposit money
    public synchronized void deposit(int amount){
        int newBalance = balance + amount;
        System.out.println(Thread.currentThread().getName()+"Depositing" + amount + "New Balance "+ newBalance);
        balance = newBalance;
    }
    //Synchronized method to withdraw money
    public synchronized void withdraw(int amount){
        int newBalance = balance - amount;
        if(newBalance >= 0){
            System.out.println(Thread.currentThread().getName()+"Withdrawing"+ amount + ". New Balance: " + newBalance);
            balance = newBalance;
        }else {
            System.out.println(Thread.currentThread().getName() + " Withdrawal failed. Insufficient balance.");
        }
    }
    public int getBalance() {
        return balance;
    }
}
