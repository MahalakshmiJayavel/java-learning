import java.util.Scanner; 

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter first number (a): ");
        int a = scan.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scan.nextInt();

        int c = 0; 

        try {
            c = a / b;
        } catch (ArithmeticException e) { 
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        System.out.println("Result: " + c); 

        scan.close(); 
    }
}
