public class TypeCastingWithOperators {
    public static void main(String[] args) {
        int a = 20;
        double b = 15.2;

        double sum = a + b;
        System.out.println("sum: " + sum);

        double multiply = (a * b);
        System.out.println("multiply " + multiply);

        double divide = (int) a / b;
        System.out.println("divide" + divide);
    }
    }
