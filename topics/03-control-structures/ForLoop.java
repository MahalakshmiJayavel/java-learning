import java.util.Scanner;
public class ForLoop {
public static void main(String[]args) {
    Scanner num = new Scanner(System.in);

    System.out.println("enter the number: ");
    int newNum= num.nextInt();

    for (int i = 1; i <= 10; i++) { 
        System.out.println(i*newNum);
}
    num.close();
}
}