package Question8;

public class BankingApplication {
    public static void main(String[] args) {
        // Creating a bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000);

        // Creating two threads to perform concurrent updates
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200);
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the final account balance
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
