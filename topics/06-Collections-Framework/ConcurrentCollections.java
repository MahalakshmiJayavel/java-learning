import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {
    public static void main(String[] args) {
        
        ConcurrentHashMap<String, Integer> scores = new ConcurrentHashMap<>();


        Thread writer = new Thread(() -> {
            scores.put("Maha", 90);
            scores.put("Shwe", 85);
            scores.put("Shamee", 95);
        });

        Thread reader = new Thread(() -> {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            for (String key : scores.keySet()) {
                System.out.println(key + " -> " + scores.get(key));
            }
        });

        writer.start();
        reader.start();
    }
}
