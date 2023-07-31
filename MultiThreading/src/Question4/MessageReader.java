package Question4;

public class MessageReader implements Runnable{
    String message;
    public MessageReader(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is reading the message: " + message);
            Thread.sleep(2000); // Simulate some processing time
            System.out.println("Thread " + Thread.currentThread().getId() + " has finished reading the message: " + message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String messageToRead = "Welcome to NucleusTeq";
        Thread []threadArray = new Thread[5];
        for(int i=0;i<threadArray.length;i++){
            threadArray[i] = new Thread(new MessageReader(messageToRead));
            threadArray[i].start();
        }
    }
}
