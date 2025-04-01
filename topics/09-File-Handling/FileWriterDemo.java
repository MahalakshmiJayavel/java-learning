import java.io.FileWriter;  
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close FileWriter
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("Hello, this is a test message!"); // Writing to the file
            System.out.println("File writing successful!"); // Confirmation message
        } 
        catch (IOException e) { // Handling file writing errors
            System.out.println("Error writing to file: " + e.getMessage());// e.getMessage() returns Only the error message
        }
    }
}
