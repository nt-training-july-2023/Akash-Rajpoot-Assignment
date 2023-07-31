package Question2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileInverter {

    public static void main(String[] args) {
        String originalFilePath = "D:\\Training\\IOStream\\src\\Question2\\Original.txt";

        try {
            // Step 1: Read the original file line by line
            List<String> lines = readLinesFromFile(originalFilePath);

            // Step 2: Reverse the order of lines
            Collections.reverse(lines);

            // Step 3: Write the inverted lines to a new file
            String invertedFileName =  "Inverted.txt";
            writeLinesToFile(invertedFileName, lines);

            System.out.println("File inverted successfully. Output file: " + invertedFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readLinesFromFile(String fileName) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    private static void writeLinesToFile(String fileName, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
