import java.util.*;
import java.util.stream.*;

class PersonB {
    String name;
    int age;

    PersonB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamFilteringonObj {
    public static void main(String[] args) {
        
        List<PersonB> people = Arrays.asList(
            new PersonB("Maha", 25),
            new PersonB("Shamee", 27),
            new PersonB("Shwe", 22),
            new PersonB("Nehaa", 28)
        );

        List<PersonB> filteredPeople = people.stream()
                                            .filter(person -> person.getAge() >= 25)  
                                            .collect(Collectors.toList());

        filteredPeople.forEach(System.out::println);
    }
}
