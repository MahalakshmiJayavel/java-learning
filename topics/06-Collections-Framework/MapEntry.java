import java.util.HashMap;

public class MapEntry {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // putIfAbsent
        scores.putIfAbsent("Maha", 90);
        scores.putIfAbsent("Shwe", 85);

        
        System.out.println("Maha's score: " + scores.getOrDefault("Maha", 0));
        System.out.println("Shamee's score: " + scores.getOrDefault("Shamee", 0));

       
        scores.replace("Shwe", 88);

        System.out.println("Updated Scores: " + scores);
    }
}
