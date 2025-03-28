public class StaticBlocks {

    static int number;

    // Static block runs before main()
    static {
        number = 10;
        System.out.println( number);
    }

    public static void main(String[] args) {
        System.out.println(number);
    }
}
