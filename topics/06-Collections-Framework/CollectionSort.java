import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }
}

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Maha", 85));
        students.add(new Student("Shamee", 92));
        students.add(new Student("Shwe", 78));

        Collections.sort(students, Comparator.comparingInt(s -> s.marks));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
