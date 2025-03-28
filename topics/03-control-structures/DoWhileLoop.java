import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int min=5;
        int max=10;
        do{
            if (number < min || number > max)
                System.out.print("Sorry, invalid");
        } while (number < min || number > max);

    }

        }
