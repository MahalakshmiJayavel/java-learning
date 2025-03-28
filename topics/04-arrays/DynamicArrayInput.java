import java.util.Scanner;

public class DynamicArrayInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("How many numbers do you want to enter? ");
        int count = a.nextInt();

        
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = a.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
