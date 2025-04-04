import java.util.ArrayList;
import java.util.List;

class members {
    String name;
    int age;
 
    members(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + age;
    }
}

public class LambdaExpressionCollections {
    public static void main(String[] args) {
        List<members> Students = new ArrayList<>();
        Students.add(new members("Maha", 25));
        Students.add(new members("Shwe", 20));
        Students.add(new members("Shamee", 22));
        

        Students.sort((a, b) -> a.name.compareTo(b.name));

        System.out.println("Names:");
        for (members m : Students) {
            System.out.println(m);
        }

        Students.sort((a, b) -> a.age - b.age);

        System.out.println("\nAge:");
        for (members m : Students) {
            System.out.println(m);
        }
    }
}
