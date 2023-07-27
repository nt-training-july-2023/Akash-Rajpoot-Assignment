package ReadingFromFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadFromFile {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please Enter Path of the File To be Read");
        String filePath;
        try{
            filePath = input.nextLine();
            // Try to open the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            // Read and display the content of the file
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            //close the Reader
            reader.close();
        }catch (IOException ioException){
            System.out.println("Error in Reading the File" + ioException.getMessage());
        }catch (Exception exception){
            System.out.println("Error in Reading the File" + exception.getMessage() );
        }finally {
            input.close();
        }
    }
}
