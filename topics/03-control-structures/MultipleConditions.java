import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("enter a number ");
        int newNumber= number.nextInt();
        
        if (newNumber >= 5 || newNumber <=15) {
            System.out.println("the Number is eligible");
        }else{
            System.out.println("the Number is not eligible");
        
        }
        }
    
}
