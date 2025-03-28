import java.util.Scanner;

public class SimpleConditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " even");
        } else {
            System.out.println(num + " odd");
        }

        input.close();
    }
}
