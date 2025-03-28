import java.util.Scanner; // Importing Scanner for user input

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating Scanner object

        // Taking user input
        System.out.print("Enter first number (a): ");
        int a = scan.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scan.nextInt();

        int c = 0; // Variable to store division result

        try {
            c = a / b; // Attempting division
        } catch (ArithmeticException e) { // Handling division by zero
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        System.out.println("Result: " + c); // Printing result (c will remain 0 if exception occurs)

        scan.close(); // Closing scanner to prevent resource leak
    }
}
