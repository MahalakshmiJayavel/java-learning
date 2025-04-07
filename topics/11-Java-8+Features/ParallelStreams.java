import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class ParallelStreams {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Maha", 75),
            new Student("Shwe", 85),
            new Student("Shamee", 90),
            new Student("Arun", 35)
        );

        Map<Boolean, List<Student>> partitioned = students.stream()
                .collect(Collectors.partitioningBy(s -> s.marks >= 50));

        System.out.println("the student who has Passed:");
        partitioned.get(true).forEach(System.out::println);

        System.out.println("\n the student who has Failed:");
        partitioned.get(false).forEach(System.out::println);
    }
}
