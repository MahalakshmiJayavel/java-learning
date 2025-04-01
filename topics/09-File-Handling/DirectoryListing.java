import java.io.File;

public class DirectoryListing {

    public static void main(String[] args) {
        
        String directoryPath = "C:/Users/mahal/OneDrive/Documents"; 
        
        File directory = new File(directoryPath);
    
        if (directory.exists() && directory.isDirectory()) {
          
            File[] files = directory.listFiles();
            
            if (files != null) {
                System.out.println("Files and directories in " + directoryPath + ":");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR] " + file.getName());
                    } else {
                        System.out.println("[FILE] " + file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
}
