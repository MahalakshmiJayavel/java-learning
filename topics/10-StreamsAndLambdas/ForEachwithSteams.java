import java.util.*;
import java.util.stream.*;

public class ForEachwithSteams {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Maha", "Shamee", "Shwe");

        names.stream()
             .forEach(System.out::println);  
    }
}
