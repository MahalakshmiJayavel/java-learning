public class ExceptionPropagation {
  static void divide() throws ArithmeticException {
        int result = 10 / 0;  
        System.out.println("Result " + result);
    }    public static void main(String[] args) {
        try {
            divide(); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Program continues.");
    }
}
