package Question2;

public class ThreadStatusChecker {
    public static void main(String[] args) {

        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");
        Thread thread3 = new Thread("Thread3");
        Thread thread4 = new Thread("Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        while(true){
            try{
                Thread.sleep(10000); // Sleep for 1 second
                System.out.println("Checking thread status...");

                // Check thread 1 status
                printThreadStatus(thread1);

                // Check thread 2 status
                printThreadStatus(thread2);

                // Check thread 3 status
                printThreadStatus(thread3);
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }
    }

    private static void printThreadStatus(Thread thread) {
        System.out.println(thread.getName() + " is " + thread.getState());
    }
    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                for(int i=0;i<8;i++){
                    System.out.println("RED");
                }
                Thread.sleep(90000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
