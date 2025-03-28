import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score:");
        int mark = scanner.nextInt();

        if (mark > 90) {
            System.out.println("GRADE = A");
        } else {
            if (mark >= 80) {
                System.out.println("GRADE = B");
            } else {
                if (mark >= 70) {
                    System.out.println("GRADE = C");
                } else {
                    if (mark >= 60) {
                        System.out.println("GRADE = D");
                    } else {
                        System.out.println("GRADE = F");
                    }
                }
            }
        }
        scanner.close();
    }
}
