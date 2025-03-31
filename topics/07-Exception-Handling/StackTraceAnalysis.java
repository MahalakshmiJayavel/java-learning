public class StackTraceAnalysis {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
            e.printStackTrace();  
        }

        System.out.println("Program Ends.");
    }
}
