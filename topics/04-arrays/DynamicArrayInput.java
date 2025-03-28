import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Asking the user to enter a number 
        System.out.print("How many numbers do you want to enter? ");
        int count = a.nextInt();

        // Creating an array as per the given size
        int[] numbers = new int[count];

        //getting numbers from the user
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = a.nextInt();
        }

        // Displaying the numbers
        System.out.println("You entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
