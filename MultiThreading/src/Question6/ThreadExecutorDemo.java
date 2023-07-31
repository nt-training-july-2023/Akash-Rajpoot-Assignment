package Question6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorDemo {

    public static void main(String[] args) {
        // Step 1: Create a Thread Executor
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Step 2: Submit tasks for execution
        for (int i = 1; i <= 5; i++) {
            String taskName = "Task " + i;
            Runnable task = createTask(taskName);
            executorService.execute(task);
        }
        // Step 3: Shutdown the executor to release resources
        executorService.shutdown();
    }
    // Helper method to create a simple task
    private static Runnable createTask(String taskName) {
        return () -> {
            System.out.println(taskName + " is being executed by " + Thread.currentThread().getName());
            try {
                // Simulating some task execution time
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(taskName + " is done.");
        };
    }
}
