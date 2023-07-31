package Question5;

public class ThreadLifecycleExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is in CREATED state.");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " is in TERMINATED state.");
    }

    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread().getId() + " is in " + Thread.currentThread().getState() + " state.");

        ThreadLifecycleExample lifecycleExample = new ThreadLifecycleExample();
        Thread thread = new Thread(lifecycleExample);
        System.out.println("New thread " + thread.getId() + " is in " + thread.getState() + " state.");

        thread.start();
        while (thread.getState() != Thread.State.TERMINATED) {
            System.out.println("Thread " + thread.getId() + " is in " + thread.getState() + " state.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
