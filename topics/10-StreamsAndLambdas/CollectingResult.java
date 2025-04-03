import java.util.*;
import java.util.stream.*;

public class CollectingResult {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Maha", "Shamee", "Shwe");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("S"))  
                                          .collect(Collectors.toList()); 
        System.out.println(filteredNames);
    }
}
