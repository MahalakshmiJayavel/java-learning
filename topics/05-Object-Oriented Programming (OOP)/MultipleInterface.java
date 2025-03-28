// First interface
interface Flyable {
    void fly();
}

// Second interface
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class Bird implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void swim() {
        System.out.println("Bird is swimming");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Bird action = new Bird();
        action.fly();   
        action.swim();  
    }
}

    

