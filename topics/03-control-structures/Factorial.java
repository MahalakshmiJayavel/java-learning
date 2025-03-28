import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter a number ");
        int number1 = num.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number1; i++) {
            
            factorial *= i;
        }

        System.out.println(number1 +"="+ factorial);


    }
}