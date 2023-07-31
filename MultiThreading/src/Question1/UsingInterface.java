package Question1;

public class UsingInterface implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Inside Run Method");
    }

    public static void main(String[] args) {
        UsingInterface u1 = new UsingInterface();
        u1.run();
    }
}
