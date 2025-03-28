public class OperatorShortCircuiting {
    public static void main (String[] args) {
        int a= 10;
        int b= 5;
        // short circuiting checks if the first option is true or false if false it wont execute the other condition

        if (a > 5 && b > 2 ) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
    }
}
