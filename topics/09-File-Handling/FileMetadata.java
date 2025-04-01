import java.io.*;
import java.text.SimpleDateFormat;

public class FileMetadata {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\mahal\\OneDrive\\Documents\\example.txt"; 
        File file = new File(filePath);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("File Size: " + fileSize + " bytes");

            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
            String lastModifiedDate = sdf.format(lastModified);
            System.out.println("Last Modified: " + lastModifiedDate);
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("The specified file does not exist at the path: " + filePath);
        }
    }
}
