class Animal {
    String name;
    int age;

    Animal() {
        name = "Kitty";
        age = 2;
    }
}

class Cat extends Animal {
    Cat() {
        super(); 

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Cat cat1 = new Cat();                 
        Cat cat2 = new Cat("Snowy", 4);      

        cat1.display();
        cat2.display();
    }
}
