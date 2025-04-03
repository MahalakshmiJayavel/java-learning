import java.util.*;
import java.util.stream.*;

public class MappingwithStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("maha", "shamee", "shwe");

        names.stream()
             .map(String::toUpperCase)  
             .forEach(System.out::println); 
    }
}
