public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);  
        } catch (Exception e) {
            System.out.println("Main exception: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }

    static void divideNumbers(int a, int b) throws Exception {
        try {
            int result = a / b;  
        } catch (ArithmeticException e) {
            throw new Exception("Error in divideNumbers method", e);
        }
    }
}
