package Question1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamExample {

    public static void main(String[] args) {

        String name = "Akash Rajpoot";
        int age = 24;
        double salary = 500;

        try {
            FileOutputStream fos = new FileOutputStream("D:\\Training\\IOStream\\src\\Question1\\Object.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(name);
            objectOutputStream.writeObject(age);
            objectOutputStream.writeObject(salary);

            System.out.println("Written Succesfully");

            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}