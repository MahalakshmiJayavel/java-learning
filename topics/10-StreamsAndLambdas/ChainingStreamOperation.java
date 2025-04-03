import java.util.*;
import java.util.stream.*;

public class ChainingStreamOperation {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(3,8, 5, 10, 15, 20, 3, 8, 2, 30,70, 18);

        List<Integer> result = numbers.stream()
                                      .filter(n -> n >= 10)  
                                      .map(n -> n * 2)      
                                      .sorted()              
                                      .collect(Collectors.toList());  

        System.out.println(result);
    }
}
