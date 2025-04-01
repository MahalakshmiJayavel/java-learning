import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

    public static void main(String[] args) {
        String fileName = "file.txt";
        String dataToAppend = "join this line as well.\n";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true); 
            
            fileWriter.write(dataToAppend);
        
            fileWriter.close();
            
            System.out.println("Data has been appended.");
        } catch (IOException e) {
            System.out.println("An error occurred .");
            e.printStackTrace();
        }
    }
}
