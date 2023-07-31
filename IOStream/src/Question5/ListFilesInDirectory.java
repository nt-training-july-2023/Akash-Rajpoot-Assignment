package Question5;

import java.io.File;


public class ListFilesInDirectory {

    public static void main(String[] args) {
        String directoryPath = "C://Documents";

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the specified path exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            // Get a list of file/directory names in the directory
            String[] fileNames = directory.list();

            // Print the list of file/directory names
            System.out.println("Files and directories in " + directoryPath + ":");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }
    }
}
