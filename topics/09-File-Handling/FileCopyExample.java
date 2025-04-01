import java.io.*;

public class FileCopyExample {

    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\mahal\\OneDrive\\Documents\\source.txt";
        String destinationFile = "C:\\Users\\mahal\\OneDrive\\Documents\\destination.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); 
            }

            System.out.println("File copied.");
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
