public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b= 15;
        int c = 20;
        int d = 25;

        int result1= a*b/c-d;
        System.out.println("result without parenthesis:  "+ result1);

        int result2= (a+b/c-d)/(d%a);
        System.out.println("result with parenthesis:  "+ result2);



    }
}
