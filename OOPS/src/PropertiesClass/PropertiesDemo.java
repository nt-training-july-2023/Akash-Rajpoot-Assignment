package PropertiesClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileStream = new FileInputStream("D:\\Training\\OOPS\\src\\PropertiesClass\\EmployeeDetails.properties");
        properties.load(fileStream);
        Enumeration enumIterator = properties.propertyNames();
        while(enumIterator.hasMoreElements()){
            System.out.println(enumIterator.nextElement());
        }

        properties.setProperty("EnployeeName","Yuvraj");
        properties.setProperty("EnployeePassword","Yes this is password");
        System.out.println(properties.getProperty("EmployeeName"));
        FileOutputStream fileOutStream = new FileOutputStream("D:\\Training\\OOPS\\src\\PropertiesClass\\EmployeeDetails.properties");
        properties.store(fileOutStream,"Updated From Akash to Yuvraj");


    }
}
