package Question4;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        String sourceFilePath = "D:\\Training\\IOStream\\src\\Question2\\Original.txt";
        String destinationFilePath = "D:\\Training\\IOStream\\src\\Question1\\Demo.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            // Read from the source file line by line and write to the destination file
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
