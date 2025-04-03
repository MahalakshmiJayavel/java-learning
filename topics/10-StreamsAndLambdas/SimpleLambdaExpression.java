public class SimpleLambdaExpression {
    public static void main(String[] args) {
        
        AddNumbers add = (a, b) -> a + b;

        int result = add.sum(5, 10);
        System.out.println("sum = " + result);
    }

    @FunctionalInterfaceDemo
    interface AddNumbers {
        int sum(int a, int b); 
    }
}
