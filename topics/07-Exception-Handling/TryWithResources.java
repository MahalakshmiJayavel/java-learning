import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            String line = reader.readLine();
            System.out.println("First line in the file: " + line);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("Program is done.");
    }
}
