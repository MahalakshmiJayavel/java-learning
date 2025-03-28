// Parent class
class Animal {
    String name = "Kitty"; // Default name
    int age = 2; // Default age
}

// Child class inheriting from Animal
class Cat extends Animal {
    // No additional properties needed since it inherits from Animal
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Cat a = new Cat(); // Cat object inherits name & age from Animal
        System.out.println(a.name); // Accessing inherited property
        System.out.println(a.age);
    }
}







