import java.util.*;
import java.util.stream.*;

public class CollecDemo {
    public static void main(String[] args) {
        
        List<String> colorList = Arrays.asList("Red", "Green", "Blue", "Yellow", "Purple", "Orange", "Pink");
        colorList.stream()
                 .forEach(System.out::println);  
    }
}
