import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        
        
        String filePath = "C:\\Users\\mahal\\OneDrive\\Documents\\example.txt"; 

        
        File file = new File(filePath);

        try {
           
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
