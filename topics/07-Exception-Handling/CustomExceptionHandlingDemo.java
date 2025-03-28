import java.util.Scanner;

// Custom exception class for invalid age
class InvalidAgeException extends Exception {
    // Constructor to pass the error message
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to validate age
class AgeValidator {
    // Method to check age, throwing exception if invalid
    void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age is Invalid. Age must be between 0 and 150.");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }
}

// Main class
public class CustomExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Creating Scanner object
        System.out.print("Enter age: ");
        int age = scan.nextInt(); // Taking user input

        // Closing the Scanner to prevent resource leak
        scan.close();

        // Creating an object of AgeValidator
        AgeValidator a1 = new AgeValidator();

        try {
            a1.checkAge(age); // Calling the method that may throw an exception
        } catch (InvalidAgeException e) { // Handling the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
