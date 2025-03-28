public class CompoundExpressions {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 25;

        int result = a + b - c + (a > b ? a : b)  | (c % 4) & (a ^ b);
        System.out.print(result);
    }
}
