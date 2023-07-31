package Question1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        // The file name to write to
        String filePath = "DD:\\Training\\IOStream\\src\\Question1\\Demo.txt";

        // The data to be written to the file
        String data = "Hello, this is a simple FileOutputStream example.";

        // Using try-with-resources to auto-close the stream
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Convert the string data to bytes and write to the file
            byte[] bytes = data.getBytes();
            fos.write(bytes);

            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
