import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Green", "Blue", "Purple", "Black");

        System.out.println("Printing Using Lambda:");
        colours.forEach(colour -> System.out.println(colour)); 

        System.out.println("\nPrinting Using Method Reference:");
        colours.forEach(System.out::println);
    }
}
