import java.util.*;

class PersonA {
    String name;
    int age;

    PersonA(String name, int age) {
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

public class SortingwithLambdas {
    public static void main(String[] args) {

        List<PersonA> people = Arrays.asList(
            new PersonA("Maha", 25),
            new PersonA("Shamee", 25),
            new PersonA("Shwe", 25),
            new PersonA("Nehaa", 25)
        );

        people.sort((person1, person2) -> Integer.compare(person1.getAge(), person2.getAge()));
        
        people.forEach(System.out::println);
    }
}

