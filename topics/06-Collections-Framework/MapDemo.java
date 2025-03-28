import java.util.HashMap; 

public class MapDemo {
    public static void main(String[] args) {
        
        HashMap<String, Integer> info = new HashMap<>();

        
        info.put("maha", 1);
        info.put("shamee", 2);
        info.put("shwe", 3);

        System.out.println("Value associated with 'maha': " + info.get("maha")); 
        System.out.println("Does the HashMap contain value 2? " + info.containsValue(2)); 
        System.out.println("Complete HashMap: " + info);
    }
}
