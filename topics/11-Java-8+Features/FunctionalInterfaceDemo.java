@FunctionalInterface
interface GreetingService {
    void greet(String name);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        GreetingService greeting = (name) -> System.out.println("Hello," + name);

        greeting.greet("Maha");
    }
}
