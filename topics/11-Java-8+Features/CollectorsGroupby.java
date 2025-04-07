import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String colour;

    Student(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public String toString() {
        return name;
    }
}

public class CollectorsGroupby {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Maha", "green"),
            new Student("Shamee", "yellow"),
            new Student("Shwe", "pink"),
            new Student("Arun", "blue")
        );

        Map<String, List<Student>> groupedByColour = students.stream()
                .collect(Collectors.groupingBy(s -> s.colour));

        groupedByColour.forEach((colour, list) -> {
            System.out.println(colour + ": " + list);
        });
    }
}
