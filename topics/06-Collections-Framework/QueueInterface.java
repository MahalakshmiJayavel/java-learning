import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("Divya");
        queue.add("Maha");
        queue.add("Shwe");
        queue.add("Shamee");
       
        System.out.println("Queue after adding elements: " + queue);

        String removed = queue.remove(); 
        System.out.println("Removed: " + removed);
        System.out.println("Queue after removal: " + queue);
    }
}
