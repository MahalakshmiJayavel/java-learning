@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        
        Calculator add = (a, b) -> a + b;  
        Calculator multiply = (a, b) -> a * b; 

        System.out.println("Add" + add.calculate(5, 3));         
        System.out.println("Multipy " + multiply.calculate(5, 3)); 
    }
}
