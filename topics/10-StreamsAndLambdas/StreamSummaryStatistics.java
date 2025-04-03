import java.util.*;
import java.util.stream.*;

public class StreamSummaryStatistics {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 10, 15, 20, 25, 30, 35, 40);
        IntSummaryStatistics stats = numbers.stream()
                                            .mapToInt(Integer::intValue) 
                                            .summaryStatistics();         
                
        System.out.println("Min: " + stats.getMin());        
        System.out.println("Max: " + stats.getMax());           
        System.out.println("Average: " + stats.getAverage());   
    }
}
