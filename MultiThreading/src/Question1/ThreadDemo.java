package Question1;

public class ThreadDemo extends Thread {

    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " - Count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " thread completed.");
    }

    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("Thread 1");
        ThreadDemo thread2 = new ThreadDemo("Thread 2");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for thread1 to finish
        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for Thread 1.");
        }

        // Wait for thread2 to finish
        try {
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for Thread 2.");
        }

        // Check if threads are alive
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());

        System.out.println("Main thread completed.");
    }
}
