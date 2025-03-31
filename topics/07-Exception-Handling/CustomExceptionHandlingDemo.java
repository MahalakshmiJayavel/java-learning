import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class AgeValidator {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age is Invalid. Age must be between 0 and 150.");
        } else {
            System.out.println("Valid Age: " + age);
        }
    }
}

public class CustomExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter age: ");
        int age = scan.nextInt(); 
        scan.close();
        AgeValidator a1 = new AgeValidator();

        try {
            a1.checkAge(age); 
        } catch (InvalidAgeException e) { 
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
