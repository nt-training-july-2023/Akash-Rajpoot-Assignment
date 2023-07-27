package CopyText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TextCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sourceFile,destinationFile;
        try{
            System.out.println("Please Enter Path of Source file");
            sourceFile = input.nextLine().trim();
            System.out.println("Please Enter The Path of the Destination File");
            destinationFile = input.nextLine().trim();

            //Try to open the source file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            // Try to open the Destination file using BufferedWriter
            BufferedWriter writer = new BufferedWriter((new FileWriter(destinationFile)));

            // Read and copy the content from the source file to the destination file
            String line;
            while((line = reader.readLine())!= null){
                writer.write(line);
                writer.newLine();
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            System.out.println("File copied successfully!");
        }catch (Exception ex){
            System.out.println("Error while Copying text" + ex.getMessage());
        }finally {
            input.close();
        }
    }
}
