import java.io.FileReader;  
import java.io.IOException; 

public class FileReaderDemo {
    public static void main(String[] args) {
        // Using try-with-resources to ensure FileReader is closed automatically
        try (FileReader fr = new FileReader("output.txt")) {
            int c;

            // Reading and printing characters until end of file (-1)
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } 
        catch (IOException e) { // Handling file reading errors
            System.out.println("Error reading the file: " + e.getMessage());// e.getMessage()	returns Only the error message
        }
    }
}
