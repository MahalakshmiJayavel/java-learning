import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("File opened successfully!");
            scanner.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist.");
        }
    }
}
