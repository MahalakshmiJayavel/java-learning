import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
    public static void main(String[] args) {
        
        List<String> names = new CopyOnWriteArrayList<>();

        // Adding elements
        names.add("Maha");
        names.add("Shwe");
        names.add("Shamee");

      
        Thread reader = new Thread(() -> {
            for (String name : names) {
                System.out.println(name);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread writer = new Thread(() -> {
            try { Thread.sleep(200); } catch (InterruptedException e) {}
            names.add("Divya");
            System.out.println("Divya (added)");
        });

        reader.start();
        writer.start();
    }
}
