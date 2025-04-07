import java.util.*;
import java.util.stream.Collectors;

public class CollectorsPartitionby {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 21, 6, 33, 2, 5);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers " + partitioned.get(true));
        System.out.println("Odd numbers " + partitioned.get(false));
    }
}
