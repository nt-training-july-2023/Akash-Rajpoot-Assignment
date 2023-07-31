package Question7;

public class ThreadPriorityExample implements Runnable{
    String message;
    public ThreadPriorityExample(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try{
            System.out.println("Thread  " + Thread.currentThread().getId()+"Started");
            Thread.sleep(500);
            System.out.println("Thread  " + Thread.currentThread().getId()+"Ended");
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadPriorityExample tpr = new ThreadPriorityExample("Welcome to NucleusTeq");
        Thread t1 = new Thread(tpr);
        Thread t2 = new Thread(tpr);
        Thread t3 = new Thread(tpr);

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
