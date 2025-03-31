public class FinalBlock {
    public static void main(String[] args) {
        try {
            int number = 15;
            int result = number / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("The finally block always runs. ");
        }

        System.out.println("Program ends here.");
    }
}

