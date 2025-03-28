import java.util.HashMap; 

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap to store String keys and Integer values
        HashMap<String, Integer> info = new HashMap<>();

        // Adding key-value pairs to the HashMap
        info.put("maha", 1);
        info.put("shamee", 2);
        info.put("shwe", 3);

        // Retrieving and printing the value associated with the key "maha"
        System.out.println("Value associated with 'maha': " + info.get("maha")); 

        // Checking if the HashMap contains the value '2'
        System.out.println("Does the HashMap contain value 2? " + info.containsValue(2)); 

        // Printing the entire HashMap
        System.out.println("Complete HashMap: " + info);
    }
}
