package Question1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ObjectInputStreamClass {

    public static void main(String[] args) {
        try {
            FileInputStream fileStream = new FileInputStream("D:\\Training\\IOStream\\src\\Question1\\Object.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            System.out.println("Name : " + objStream.readObject());
            System.out.println("Age : " + objStream.readObject());
            System.out.println("Salary : " + objStream.readObject());
            objStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}