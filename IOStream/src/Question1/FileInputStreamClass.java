package Question1;

import java.io.FileInputStream;

public class FileInputStreamClass {

    public static void main(String[] args) {
        try {
            FileInputStream fileReader = new FileInputStream("D:\\Training\\IOStream\\src\\Question1\\Demo.txt");

            int data = fileReader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (Exception e) {
        }
    }

}