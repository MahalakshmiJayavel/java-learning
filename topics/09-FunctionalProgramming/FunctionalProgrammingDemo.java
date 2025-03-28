import java.util.Arrays;  // Importing Arrays utility class
import java.util.List;     // Importing List interface

public class FunctionalProgrammingDemo {
    public static void main(String[] args) {
        // Creating a list of numbers using Arrays.asList()
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to filter even numbers and print them
        numbers.stream()           // Convert list to a Stream
               .filter(n -> n % 2 == 0)  // Lambda expression to filter even numbers
               .forEach(System.out::println);  // Print each even number
    }
}
