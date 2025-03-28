class Heart {
    void beat() {
        System.out.println("Heart is beating");
    }
}

class Person {
    private Heart heart;  

    Person() {
        heart = new Heart();  

    void live() {
        heart.beat();  
        System.out.println("Person is alive!");
    }
}

public class Composition {
    public static void main(String[] args) {
        Person person = new Person();
        person.live();
    }
}
