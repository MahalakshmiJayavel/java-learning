import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner askMarks = new Scanner(System.in);

        int mark1 = askMarks.nextInt();

        String result = mark1 > 50 ? "passed" : "failed";
        System.out.println("the student has " + result);


    }
}
