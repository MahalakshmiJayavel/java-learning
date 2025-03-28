// Parent class (superclass)
class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class (subclass) overriding sound() method
class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Lion(); 
        a.sound(); // Calls overridden method in Lion class
    }
}

