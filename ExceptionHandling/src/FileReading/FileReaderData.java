package FileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderData {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please Enter FileName");
        String fileName = input.nextLine().trim();
        readDataFromFile(fileName);
    }


    public static void readDataFromFile(String filename) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurs during input" + e.getMessage());
//            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error occurs during input" + e.getMessage());
//                    e.printStackTrace();
                }
            }
        }
    }
}

