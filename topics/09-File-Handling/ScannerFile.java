import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

    public static void main(String[] args) {
        
        String fileName = "New Text Document.txt";

        try {

            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found ");
            e.printStackTrace();
        }
    }
}
