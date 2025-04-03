import java.util.*;
import java.util.function.*;

public class ConsumerInterface {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Maha", "Shamee", "Shwe", "Nehaa");

        Consumer<String> printName = name -> System.out.println(name);

        names.stream()
             .forEach(printName); 

    }
}
