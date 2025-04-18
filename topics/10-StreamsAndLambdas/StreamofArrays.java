import java.util.*;
import java.util.stream.*;

public class StreamofArrays {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> result = Arrays.stream(numbers)  
                                     .filter(n -> n % 2 != 0)  
                                     .map(n -> n * 2)  
                                     .boxed()  
                                     .collect(Collectors.toList());  

        System.out.println(result);
    }
}
