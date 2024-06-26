import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputstram {

    public static void main(String[] args) {
        // Specify input and output file paths
        String inputFile = "hello.txt";
        String outputFile = "output.txt";

        try {
            // Read from file using FileInputStream
            byte[] buffer = readFromFile(inputFile);

            // Write to file using FileOutputStream
            writeToFile(outputFile, buffer);

            System.out.println("File read and write successful.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Method to read from a file using FileInputStream
    private static byte[] readFromFile(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Determine the size of the file
            int fileSize = fis.available();

            // Read the entire file into a byte array
            byte[] buffer = new byte[fileSize];
            fis.read(buffer);

            return buffer;
        }
    }

    // Method to write to a file using FileOutputStream
    private static void writeToFile(String filePath, byte[] data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            // Write the data to the file
            fos.write(data);
        }
    }
}
