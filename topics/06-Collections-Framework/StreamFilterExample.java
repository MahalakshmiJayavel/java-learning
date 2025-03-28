import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Maha");
        names.add("Shwe");
        names.add("Shamee");
        names.add("Divya");

        List<String> filtered = names.stream()
                                     .filter(name -> name.startsWith("S"))
                                     .collect(Collectors.toList());

        System.out.println("Names with 'S' : " + filtered);
    }
}
