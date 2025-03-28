class Heart {
    void beat() {
        System.out.println("Heart is beating");
    }
}

class Person {
    private Heart heart;  // Composition: Person has a Heart

    Person() {
        heart = new Heart();  // Heart is created with the Person
    }

    void live() {
        heart.beat();  // Person uses Heart
        System.out.println("Person is alive!");
    }
}

public class Composition {
    public static void main(String[] args) {
        Person person = new Person();
        person.live();
    }
}
