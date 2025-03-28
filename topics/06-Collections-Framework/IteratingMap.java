import java.util.HashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Maha", 90);
        marks.put("Shwe", 85);
        marks.put("Shamee", 95);
        
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Marks: " + entry.getValue());
        }
    }
}
