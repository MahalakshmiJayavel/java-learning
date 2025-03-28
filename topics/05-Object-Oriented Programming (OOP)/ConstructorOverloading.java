// Parent class
class Animal {
    String name;
    int age;

    // Default constructor
    Animal() {
        name = "Kitty";
        age = 2;
    }
}

// Child class inheriting from Animal
class Cat extends Animal {
    // Constructor 1: No arguments
    Cat() {
        super(); // calls Animal's default constructor
    }

    // Constructor 2: Accepts name and age
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class ConstructorOverloading {
    public static void main(String[] args) {
        Cat cat1 = new Cat();                 // Uses default values from Animal
        Cat cat2 = new Cat("Snowy", 4);       // Uses custom values

        cat1.display();
        cat2.display();
    }
}
