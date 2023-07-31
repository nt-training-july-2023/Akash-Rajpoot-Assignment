package Question2;

public class MultipleThreadExample implements Runnable {

    static int i = -1;

    @Override
    public void run() {
        i++;
        System.out.println(Thread.currentThread().getName() + " is running. i = " + i);
    }

    public static void main(String[] args) {

        MultipleThreadExample multipleThreadExample = new MultipleThreadExample();
        Thread th = new Thread(multipleThreadExample);
        Thread th1 = new Thread(multipleThreadExample);
        Thread th2 = new Thread(multipleThreadExample);
        Thread th3 = new Thread(multipleThreadExample);
        Thread th4 = new Thread(multipleThreadExample);
        Thread th5 = new Thread(multipleThreadExample);

        th.setName("th");
        th1.setName("th1");
        th2.setName("th2");
        th3.setName("th3");
        th4.setName("th4");
        th5.setName("th5");

        System.out.println(th.getName());
        System.out.println(th1.getName());
        System.out.println(th2.getName());
        System.out.println(th3.getName());
        System.out.println(th4.getName());
        System.out.println(th5.getName() + "\n");

        th.start();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

    }

}
