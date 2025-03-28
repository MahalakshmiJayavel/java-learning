import java.util.Scanner;  // Correct import statement

public class RelationalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number2: ");
        int number2 = scanner.nextInt();

        if(number1 == number2) {
            System.out.println("Number 1 is equal to Number 2");
        }
        if(number1 != number2) {
            System.out.println("Number 1 is not equal to Number 2");
        }
        if(number1 > number2) {
            System.out.println("Number 1 is greater than Number 2");
        }
        if(number1 < number2) {
            System.out.println("Number 1 is smaller than Number 2");
        }
        if(number1 >= number2) {
            System.out.println("Number 1 is greater than or equal to Number 2");
        }
        if(number1 <= number2) {
            System.out.println("Number 1 is less than or equal to Number 2");
        }

        scanner.close();
    }
}
